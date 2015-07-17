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

import eric.bottard.tis100.grammar.Tis100Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Map;

/**
 * The main ANTLR listener that "compiles" a T21 program.
 *
 * <p>This populates a list of {@link Instruction}s, and uses already resolved
 * label offsets from a previous pass.</p>
 *
 * @author Eric Bottard
 */
public class NodeCompilationListener extends AbstractTis100Compiler {

    private final Node node;

    private final Map<String, Integer> labels;

    private ParseTreeProperty<ValueSource> getters = new ParseTreeProperty<>();

    private ParseTreeProperty<ValueDestination> setters = new ParseTreeProperty<>();


    public NodeCompilationListener(Node node, Map<String, Integer> labels) {
        this.node = node;
        this.labels = labels;
    }

    @Override
    public void exitNode(@NotNull Tis100Parser.NodeContext ctx) {
        node.setNextLine(0);
    }

    @Override
    public void exitNOP(Tis100Parser.NOPContext ctx) {
        addInstruction(ctx, () -> {
            node.nextLine();
        });
    }

    @Override
    public void exitMOV(@NotNull Tis100Parser.MOVContext ctx) {
        ValueSource valueSource = getters.get(ctx.src());
        ValueDestination valueDestination = setters.get(ctx.dst());

        node.setInstruction(lineOf(ctx), () -> {
            int value = valueSource.get();
            valueDestination.set(value);
            node.nextLine();
        });
    }

    @Override
    public void exitSWP(Tis100Parser.SWPContext ctx) {
        addInstruction(ctx, () -> {
            int tmp = node.getAcc();
            node.setAcc(node.getBak());
            node.setBak(tmp);
            node.nextLine();
        });
    }

    @Override
    public void exitSAV(Tis100Parser.SAVContext ctx) {
        addInstruction(ctx, () -> {
            node.setBak(node.getAcc());
            node.nextLine();
        });
    }

    @Override
    public void exitADD(@NotNull Tis100Parser.ADDContext ctx) {
        ValueSource getter = getters.get(ctx.src());
        addInstruction(ctx, () -> {
            int before = node.getAcc();
            int operand = getter.get();
            node.setAcc(before + operand);
            node.nextLine();
        });
    }

    @Override
    public void exitSUB(@NotNull Tis100Parser.SUBContext ctx) {
        ValueSource getter = getters.get(ctx.src());
        addInstruction(ctx, () -> {
            int before = node.getAcc();
            int operand = getter.get();
            node.setAcc(before - operand);
            node.nextLine();
        });
    }

    @Override
    public void exitNEG(@NotNull Tis100Parser.NEGContext ctx) {
        addInstruction(ctx, () -> {
            node.setAcc(-node.getAcc());
            node.nextLine();
        });
    }

    @Override
    public void exitJMP(@NotNull Tis100Parser.JMPContext ctx) {
        int line = lineForLabel(ctx);
        addInstruction(ctx, () -> node.setNextLine(line));
    }

    @Override
    public void exitJEZ(@NotNull Tis100Parser.JEZContext ctx) {
        int line = lineForLabel(ctx);
        addInstruction(ctx, () -> {
            if (node.getAcc() == 0) {
                node.setNextLine(line);
            } else {
                node.nextLine();
            }
        });
    }

    @Override
    public void exitJNZ(@NotNull Tis100Parser.JNZContext ctx) {
        int line = lineForLabel(ctx);
        addInstruction(ctx, () -> {
            if (node.getAcc() != 0) {
                node.setNextLine(line);
            } else {
                node.nextLine();
            }
        });
    }

    @Override
    public void exitJGZ(@NotNull Tis100Parser.JGZContext ctx) {
        int line = lineForLabel(ctx);
        addInstruction(ctx, () -> {
            if (node.getAcc() > 0) {
                node.setNextLine(line);
            } else {
                node.nextLine();
            }
        });
    }

    @Override
    public void exitJLZ(@NotNull Tis100Parser.JLZContext ctx) {
        int line = lineForLabel(ctx);
        addInstruction(ctx, () -> {
            if (node.getAcc() < 0) {
                node.setNextLine(line);
            } else {
                node.nextLine();
            }
        });
    }

    @Override
    public void exitJRO(@NotNull Tis100Parser.JROContext ctx) {
        ValueSource getter = getters.get(ctx.src());
        addInstruction(ctx, () -> {
            node.setNextLine(node.getNextLine() + getter.get());
        });
    }

    @Override
    public void exitSourceRegister(@NotNull Tis100Parser.SourceRegisterContext ctx) {
        getters.put(ctx, node.sourceRegister(ctx.getText()));
    }

    @Override
    public void exitSourceInt(@NotNull Tis100Parser.SourceIntContext ctx) {
        getters.put(ctx, () -> Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitSourcePort(@NotNull Tis100Parser.SourcePortContext ctx) {
        getters.put(ctx, node.sourcePort(ctx.getText()));
    }

    @Override
    public void exitDestinationRegister(@NotNull Tis100Parser.DestinationRegisterContext ctx) {
        setters.put(ctx, node.destinationRegister(ctx.getText()));
    }

    @Override
    public void exitDestinationPort(@NotNull Tis100Parser.DestinationPortContext ctx) {
        setters.put(ctx, node.destinationPort(ctx.getText()));
    }

    private void addInstruction(ParserRuleContext ctx, Instruction instruction) {
        node.setInstruction(lineOf(ctx), instruction);
    }

    private int lineForLabel(ParserRuleContext ctx) {
        String label = ctx.getToken(Tis100Parser.ID, 0).getText();
        Integer line = labels.get(label);
        if (line == null) {
            throw new IllegalStateException(String.format("No label %s", label));
        }
        return line;
    }
}
