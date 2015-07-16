// Generated from /Users/ebottard/Documents/projects/tis-100/src/main/java/eric/bottard/Tis100.g4 by ANTLR 4.5
package eric.bottatd.tis100.grammar;
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
	 * Enter a parse tree produced by {@link Tis100Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull Tis100Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tis100Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull Tis100Parser.CommentContext ctx);
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
	 * Enter a parse tree produced by {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull Tis100Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tis100Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull Tis100Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void enterSrc(@NotNull Tis100Parser.SrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tis100Parser#src}.
	 * @param ctx the parse tree
	 */
	void exitSrc(@NotNull Tis100Parser.SrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tis100Parser#dst}.
	 * @param ctx the parse tree
	 */
	void enterDst(@NotNull Tis100Parser.DstContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tis100Parser#dst}.
	 * @param ctx the parse tree
	 */
	void exitDst(@NotNull Tis100Parser.DstContext ctx);
}