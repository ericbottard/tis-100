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
import eric.bottard.tis100.grammar.Tis100Parser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * An ANTLR listener over the TIS-100 language that is used as a first pass.
 * <p>Records the label to line number mappings and checks that there are
 * no label duplicates.</p>
 *
 * @author Eric Bottard
 */
public class NodeLabelListener extends AbstractTis100Compiler {

	private Map<String, Integer> labels = new HashMap<>();

	public int getLines() {
		return lines;
	}

	public Map<String, Integer> getLabels() {
		return labels;
	}

	private int lines;

	@Override
	public void exitLabel(@NotNull Tis100Parser.LabelContext ctx) {
		String label = ctx.ID().toString();
		if (labels.put(label, lineOf(ctx)) != null) {
			throw new IllegalStateException("Duplicate labels " + label);
		}

	}

	@Override
	public void exitLine(@NotNull Tis100Parser.LineContext ctx) {
		lines++;
	}
}
