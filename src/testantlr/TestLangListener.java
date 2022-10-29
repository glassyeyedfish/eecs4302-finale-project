// Generated from TestLang.g4 by ANTLR 4.9.3

	package testantlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestLangParser}.
 */
public interface TestLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code TLProgram}
	 * labeled alternative in {@link TestLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterTLProgram(TestLangParser.TLProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLProgram}
	 * labeled alternative in {@link TestLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitTLProgram(TestLangParser.TLProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TLRun}
	 * labeled alternative in {@link TestLangParser#run}.
	 * @param ctx the parse tree
	 */
	void enterTLRun(TestLangParser.TLRunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLRun}
	 * labeled alternative in {@link TestLangParser#run}.
	 * @param ctx the parse tree
	 */
	void exitTLRun(TestLangParser.TLRunContext ctx);
}