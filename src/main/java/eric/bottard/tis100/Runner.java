/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eric.bottard.tis100;

import org.fusesource.jansi.Ansi;
import org.springframework.integration.channel.NullChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.channel.RendezvousChannel;
import org.springframework.messaging.*;
import org.springframework.messaging.support.GenericMessage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Runs a single TIS-100 problem in process. Both the problem statement and the solution
 * must be provided as arguments.
 *
 * @author Eric Bottard
 */
public class Runner {

    private int rows;

    private int columns;

    private MessageChannel[] verticalChannels;

    private MessageChannel[] horizontalChannels;

    private List<SpringNode> nodes = new ArrayList<>();

    public Runner(int rows, int columns, String specificationFile, File solution) throws IOException {

        Specification specification = new LuaSpecification(specificationFile, rows, columns);

        List<String> nodeSources = loadSolution(solution, specification.getLayout());


        this.rows = rows;
        this.columns = columns;

        verticalChannels = new MessageChannel[columns * (rows + 1) * 2];
        horizontalChannels = new MessageChannel[rows * (columns + 1) * 2];

        // channels[2*x] = ltr / down-to-up
        // channels[2*x + 1] = rtl / up-to-down
        for (int row = 0; row <= rows; row++) {
            for (int column = 0; column < columns; column++) {
                verticalChannels[(row * columns + column) * 2] = (row == 0 || row == rows) ? new NullChannel() : new RendezvousChannel();
                if (row == 0) {
                    verticalChannels[(row * columns + column) * 2 + 1] = new QueueChannel(40);
                } else if (row == rows) {
                    verticalChannels[(row * columns + column) * 2 + 1] = new PublishSubscribeChannel();
                } else {
                    verticalChannels[(row * columns + column) * 2 + 1] = new RendezvousChannel();
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column <= columns; column++) {
                horizontalChannels[(column * rows + row) * 2] = (column == 0 || column == columns) ? new NullChannel() : new RendezvousChannel();
                horizontalChannels[(column * rows + row) * 2 + 1] = (column == 0 || column == columns) ? new NullChannel() : new RendezvousChannel();
            }
        }

        Thread[] threads = new Thread[rows * columns];
        Object mutex = new Object();

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                final SpringNode node = NodeFactory.buildNode(nodeSources.get(row * columns + column));
                final NodePrettyPrinter printer = new NodePrettyPrinter(4 + row * 19, SpecificationPrettyPrinter.WIDTH + 10 + column * 37, node);
                Ports ports = new PortsMapping(row, column);
                node.setPorts(ports);
                nodes.add(node);
                threads[row * columns + column] = new Thread() {
                    @Override
                    public void run() {

                        boolean more;
                        do {
                            synchronized (mutex) {
                                printer.draw(System.out);
                            }
                            try {
                                Thread.sleep(150);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            more = node.tick();
                        } while (more);
                    }
                };
            }
        }



        List<Integer>[] actuals = new List[columns];
        SpecificationPrettyPrinter specificationPrettyPrinter = new SpecificationPrettyPrinter(specification, 2, 2, actuals);

        for (int i = 0; i < columns; i++) {
            Specification.Stream stream = specification.getInputStreams()[i];
            if (stream != null) {
                for (Integer in : stream.getData()) {
                    verticalChannels[1 + 2 * i].send(new GenericMessage<>(in));
                }
            }
            stream = specification.getOutputStreams()[i];
            final List<Integer> actual = actuals[i] = new ArrayList<>();
            if (stream != null) {
                ((SubscribableChannel) verticalChannels[1 + 2 * (i + rows * columns)]).subscribe(new MessageHandler() {
                    @Override
                    public void handleMessage(Message<?> message) throws MessagingException {
                        actual.add((Integer) message.getPayload());
                        synchronized (mutex) {
                            specificationPrettyPrinter.draw(System.out);
                        }
                    }
                });
            }
        }
        synchronized (mutex) {
            specificationPrettyPrinter.draw(System.out);
        }

        for (int i = 0; i < rows * columns; i++) {
            threads[i].start();
        }

    }

    private List<String> loadSolution(File solution, List<Specification.Tile> layout) throws IOException {
        int node = 0;
        List<String> result = new ArrayList<>(layout.size());
        BufferedReader reader = new BufferedReader(new FileReader(solution));
        String line = reader.readLine();
        StringBuilder sb = null;
        while (line != null) {
            if (line.startsWith("@")) {
                if (sb != null) {
                    Specification.Tile tile = layout.get(node);
                    while (tile != Specification.Tile.TILE_COMPUTE) {
                        result.add("#" + tile.toString()+"\n");
                        tile = layout.get(++node);
                    }
                    result.add(sb.toString());
                    node++;
                }
                sb = new StringBuilder();
            } else {
                sb.append(line).append('\n');
            }
            line = reader.readLine();
        }
        // Set last source snippet
        Specification.Tile tile = layout.get(node);
        while (tile != Specification.Tile.TILE_COMPUTE) {
            result.add(node, "#" + tile.toString());
            tile = layout.get(++node);
        }
        result.add(sb.toString());
        // Remaining nodes are assumed to be empty T21s (wrong, revisit)
        while (++node < layout.size() && layout.get(node) == Specification.Tile.TILE_COMPUTE) {
            result.add("");
        }
        reader.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.append(Ansi.ansi().bg(Ansi.Color.BLACK).fg(Ansi.Color.WHITE).toString());
        System.out.println(Ansi.ansi().eraseScreen());
        new Runner(3, 4, args[0], new File(args[1]));
    }

    private class PortsMapping implements Ports {

        private final int row;
        private final int column;

        public PortsMapping(int row, int column) {

            this.row = row;
            this.column = column;
        }

        @Override
        public MessageChannel outUp() {
            return verticalChannels[(row * columns + column) * 2];
        }

        @Override
        public MessageChannel outDown() {
            return verticalChannels[((row + 1) * columns + column) * 2 + 1];
        }

        @Override
        public PollableChannel inUp() {
            return (PollableChannel) verticalChannels[(row * columns + column) * 2 + 1];
        }

        @Override
        public PollableChannel inDown() {
            return (PollableChannel) verticalChannels[((row + 1) * columns + column) * 2];
        }

        @Override
        public MessageChannel outLeft() {
            return horizontalChannels[(column * rows + row) * 2 + 1];
        }

        @Override
        public MessageChannel outRight() {
            return horizontalChannels[((column + 1) * rows + row) * 2];
        }

        @Override
        public PollableChannel inLeft() {
            return (PollableChannel) horizontalChannels[(column * rows + row) * 2];
        }

        @Override
        public PollableChannel inRight() {
            return (PollableChannel) horizontalChannels[((column + 1) * rows + row) * 2 + 1];
        }
    }
}
