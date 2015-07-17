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

import java.io.PrintStream;
import java.util.List;

/**
 * Displays parts of the Specification, on the left side of the screen.
 *
 * @author Eric Bottard
 */
public class SpecificationPrettyPrinter extends Printer {

    public static final int WIDTH = 40;

    private final Specification specification;

    private final int row;

    private final int col;

    private final List<Integer>[] actuals;

    public SpecificationPrettyPrinter(Specification specification, int row, int col, List<Integer>[] actuals) {
        this.specification = specification;
        this.row = row;
        this.col = col;
        this.actuals = actuals;
    }

    public void draw(PrintStream out) {
        out.append(Ansi.ansi().cursor(row, col).toString());
        center(out, specification.getName(), WIDTH);

        out.append(Ansi.ansi().cursor(row + 3, col).toString());
        out.append("╔══════════════════════════════════════╗");
        out.append(Ansi.ansi().cursorDown(1).cursorLeft(WIDTH).toString());
        for (int i = 0; i < 4; i++) {
            String line = (i < specification.getDescription().length) ? specification.getDescription()[i] : "";
            out.append("║ ");
            rightPad(out, line, WIDTH - 4);
            out.append(" ║");
            out.append(Ansi.ansi().cursorDown(1).cursorLeft(WIDTH).toString());
        }
        out.append("╚══════════════════════════════════════╝");

        out.append(Ansi.ansi().cursor(row + 3 + 6 + 2, col).toString());
        int j;
        for (int i = 0; i < specification.getInputStreams().length; i++) {
            Specification.Stream stream = specification.getInputStreams()[i];
            if (stream != null) {
                center(out, stream.getName(), 5);
                out.append(Ansi.ansi().cursorDown(1).cursorLeft(5).toString());
                out.append("╔═══╗");
                out.append(Ansi.ansi().cursorDown(1).cursorLeft(5).toString());
                for (j = 0; j < 39; j++) {
                    String d = j < stream.getData().size() ? stream.getData().get(j).toString() : "";
                    out.append("║");
                    leftPad(out, d, 3);
                    out.append("║");
                    out.append(Ansi.ansi().cursorDown(1).cursorLeft(5).toString());
                }
                out.append("╚═══╝");
                out.append(Ansi.ansi().cursorUp(j + 2).cursorRight(2).toString());
            }
        }
        for (int i = 0; i < specification.getOutputStreams().length; i++) {
            Specification.Stream stream = specification.getOutputStreams()[i];
            if (stream != null) {
                center(out, stream.getName(), 9);
                out.append(Ansi.ansi().cursorDown(1).cursorLeft(9).toString());
                out.append("╔═══╦═══╗");
                out.append(Ansi.ansi().cursorDown(1).cursorLeft(9).toString());
                for (j = 0; j < 39; j++) {
                    String expected = j < stream.getData().size() ? stream.getData().get(j).toString() : "";
                    String actual = j < actuals[i].size() ? actuals[i].get(j).toString() : "";
                    out.append("║");
                    leftPad(out, expected, 3);
                    out.append("║");
                    leftPad(out, actual, 3);
                    out.append("║");
                    out.append(Ansi.ansi().cursorDown(1).cursorLeft(9).toString());
                }
                out.append("╚═══╩═══╝");
                out.append(Ansi.ansi().cursorUp(j + 2).cursorRight(2).toString());
            }
        }


    }
}
