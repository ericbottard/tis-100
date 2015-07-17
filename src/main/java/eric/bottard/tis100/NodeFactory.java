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

import eric.bottard.tis100.grammar.Tis100Lexer;
import eric.bottard.tis100.grammar.Tis100Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.fusesource.jansi.Ansi;

/**
 * Builds Nodes from their source form.
 *
 * @author Eric Bottard
 */
public class NodeFactory {

	public static SpringNode buildNode(String source) {
		ANTLRInputStream input = new ANTLRInputStream(source);
		Tis100Lexer lexer = new Tis100Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Tis100Parser parser = new Tis100Parser(tokens);
		ParseTree tree = parser.node();

		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

		NodeLabelListener nodeLabelListener = new NodeLabelListener();
		parseTreeWalker.walk(nodeLabelListener, tree);

		SpringNode node = new SpringNode(source.split("\\n"));

		NodeCompilationListener nodeCompilationListener = new NodeCompilationListener(node, nodeLabelListener.getLabels());
		parseTreeWalker.walk(nodeCompilationListener, tree);
		return node;
	}
}
