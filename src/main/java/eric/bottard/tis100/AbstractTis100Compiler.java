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

import eric.bottard.tis100.grammar.Tis100BaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Abstract base class for ANTLR listeners.
 *
 * @author Eric Bottard
 */
public class AbstractTis100Compiler extends Tis100BaseListener {

    /**
     * Return the 0-based line number of a program construct from the
     * parsing context.
     */
    protected int lineOf(ParserRuleContext ctx) {
        return ctx.getStart().getLine() - 1;
    }
}
