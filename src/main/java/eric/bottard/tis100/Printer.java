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

import java.io.PrintStream;

/**
 * Base class for pretty printing, provides some helper methods.
 *
 * @author Eric Bottard
 */
public class Printer {
    protected void leftPad(PrintStream out, String what, int width) {
        for (int howMuch = width - what.length(); howMuch > 0; howMuch--) {
            out.print(' ');
        }
        out.append(what);
    }

    protected void rightPad(PrintStream out, String what, int to) {
        out.append(what);
        for (int howMuch = to - what.length(); howMuch > 0; howMuch--) {
            out.print(' ');
        }
    }

    protected void center(PrintStream out, String what, int width) {
        int before = (width - what.length()) / 2;
        int after = (width - what.length() + 1) / 2;
        for (int i = 0; i < before; i++) {
            out.append(' ');
        }
        out.append(what);
        for (int i = 0; i < after; i++) {
            out.append(' ');
        }
    }
}
