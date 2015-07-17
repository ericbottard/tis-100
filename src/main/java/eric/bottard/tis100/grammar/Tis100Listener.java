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

// Generated from /Users/ebottard/Documents/projects/tis-100/src/main/java/eric/bottard/Tis100.g4 by ANTLR 4.5
package eric.bottard.tis100.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Tis100Parser}.
 */
public interface Tis100Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Tis100Parser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(@NotNull Tis100Parser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tis100Parser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(@NotNull Tis100Parser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tis100Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull Tis100Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tis100Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull Tis100Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tis100Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull Tis100Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tis100Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull Tis100Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOP}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNOP(@NotNull Tis100Parser.NOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOP}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNOP(@NotNull Tis100Parser.NOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MOV}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterMOV(@NotNull Tis100Parser.MOVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MOV}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitMOV(@NotNull Tis100Parser.MOVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SWP}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSWP(@NotNull Tis100Parser.SWPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SWP}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSWP(@NotNull Tis100Parser.SWPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SAV}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSAV(@NotNull Tis100Parser.SAVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SAV}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSAV(@NotNull Tis100Parser.SAVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterADD(@NotNull Tis100Parser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitADD(@NotNull Tis100Parser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSUB(@NotNull Tis100Parser.SUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSUB(@NotNull Tis100Parser.SUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEG}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNEG(@NotNull Tis100Parser.NEGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEG}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNEG(@NotNull Tis100Parser.NEGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JMP}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJMP(@NotNull Tis100Parser.JMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JMP}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJMP(@NotNull Tis100Parser.JMPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JEZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJEZ(@NotNull Tis100Parser.JEZContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JEZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJEZ(@NotNull Tis100Parser.JEZContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JNZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJNZ(@NotNull Tis100Parser.JNZContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JNZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJNZ(@NotNull Tis100Parser.JNZContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JGZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJGZ(@NotNull Tis100Parser.JGZContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JGZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJGZ(@NotNull Tis100Parser.JGZContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JLZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJLZ(@NotNull Tis100Parser.JLZContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JLZ}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJLZ(@NotNull Tis100Parser.JLZContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JRO}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJRO(@NotNull Tis100Parser.JROContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JRO}
	 * labeled alternative in {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJRO(@NotNull Tis100Parser.JROContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceRegister}
	 * labeled alternative in {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void enterSourceRegister(@NotNull Tis100Parser.SourceRegisterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceRegister}
	 * labeled alternative in {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void exitSourceRegister(@NotNull Tis100Parser.SourceRegisterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceInt}
	 * labeled alternative in {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void enterSourceInt(@NotNull Tis100Parser.SourceIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceInt}
	 * labeled alternative in {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void exitSourceInt(@NotNull Tis100Parser.SourceIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourcePort}
	 * labeled alternative in {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void enterSourcePort(@NotNull Tis100Parser.SourcePortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourcePort}
	 * labeled alternative in {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void exitSourcePort(@NotNull Tis100Parser.SourcePortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code destinationRegister}
	 * labeled alternative in {@link Tis100Parser#dst}.
	 * @param ctx the parse tree
	 */
	void enterDestinationRegister(@NotNull Tis100Parser.DestinationRegisterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code destinationRegister}
	 * labeled alternative in {@link Tis100Parser#dst}.
	 * @param ctx the parse tree
	 */
	void exitDestinationRegister(@NotNull Tis100Parser.DestinationRegisterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code destinationPort}
	 * labeled alternative in {@link Tis100Parser#dst}.
	 * @param ctx the parse tree
	 */
	void enterDestinationPort(@NotNull Tis100Parser.DestinationPortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code destinationPort}
	 * labeled alternative in {@link Tis100Parser#dst}.
	 * @param ctx the parse tree
	 */
	void exitDestinationPort(@NotNull Tis100Parser.DestinationPortContext ctx);
}
