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

/**
 * Pretty prints a T21 node using ANSI art.
 *
 * @author Eric Bottard
 */
public class NodePrettyPrinter extends Printer {

    private final int row;

    private final int col;

    private final Node node;

    public NodePrettyPrinter(int row, int col, Node node) {
        this.row = row;
        this.col = col;
        this.node = node;
    }

    public void draw(PrintStream out) {
        final int W = 27;
        out.append(Ansi.ansi().cursor(row, col).toString());
        out.append(Ansi.ansi().bg(Ansi.Color.BLACK).fg(Ansi.Color.WHITE).toString());
        out.append("╔═══════════════════╦═════╗");
        out.append(Ansi.ansi().cursorDown(1).cursorLeft(W).toString());
        for (int i = 0; i < node.getSource().length; i++) {
            String line = node.getSource()[i];
            out.append("║");
            if (i == node.getNextLine()) {
                out.append(Ansi.ansi().bg(Ansi.Color.WHITE).fg(Ansi.Color.BLACK).toString());
            }
            rightPad(out, line, 19);
            if (i == node.getNextLine()) {
                out.append(Ansi.ansi().bg(Ansi.Color.BLACK).fg(Ansi.Color.WHITE).toString());
            }
            if (i % 3 == 2) {
                out.append("╠═════╣");
            } else {
                out.append("║     ║");
            }
            out.append(Ansi.ansi().cursorDown(1).cursorLeft(W).toString());
        }
        for (int i = node.getSource().length; i < 14; i++) {
            if (i % 3 == 2) {
                out.append("║                   ╠═════╣");
            } else {
                out.append("║                   ║     ║");
            }
            out.append(Ansi.ansi().cursorDown(1).cursorLeft(W).toString());
        }
        out.append("╚═══════════════════╩═════╝");

        out.append(Ansi.ansi().cursorLeft(5).cursorUp(14).toString()).append("ACC");
        out.append(Ansi.ansi().cursorLeft(3).cursorDown(1).toString());
        leftPad(out, "" + node.getAcc(), 3);

        out.append(Ansi.ansi().cursorLeft(3).cursorDown(2).toString()).append("BAK");
        out.append(Ansi.ansi().cursorLeft(3).cursorDown(1).toString());
        leftPad(out, "" + node.getBak(), 3);
    }

}
