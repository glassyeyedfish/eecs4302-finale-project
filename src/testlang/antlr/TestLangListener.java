// Generated from TestLang.g4 by ANTLR 4.9.3

	package testlang.antlr;

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
	 * Enter a parse tree produced by the {@code TLTestFunc}
	 * labeled alternative in {@link TestLangParser#test_func}.
	 * @param ctx the parse tree
	 */
	void enterTLTestFunc(TestLangParser.TLTestFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLTestFunc}
	 * labeled alternative in {@link TestLangParser#test_func}.
	 * @param ctx the parse tree
	 */
	void exitTLTestFunc(TestLangParser.TLTestFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TLFunctionCall}
	 * labeled alternative in {@link TestLangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterTLFunctionCall(TestLangParser.TLFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLFunctionCall}
	 * labeled alternative in {@link TestLangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitTLFunctionCall(TestLangParser.TLFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TLAssertEquals}
	 * labeled alternative in {@link TestLangParser#assrt}.
	 * @param ctx the parse tree
	 */
	void enterTLAssertEquals(TestLangParser.TLAssertEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLAssertEquals}
	 * labeled alternative in {@link TestLangParser#assrt}.
	 * @param ctx the parse tree
	 */
	void exitTLAssertEquals(TestLangParser.TLAssertEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TLAssert}
	 * labeled alternative in {@link TestLangParser#assrt}.
	 * @param ctx the parse tree
	 */
	void enterTLAssert(TestLangParser.TLAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLAssert}
	 * labeled alternative in {@link TestLangParser#assrt}.
	 * @param ctx the parse tree
	 */
	void exitTLAssert(TestLangParser.TLAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TLInteger}
	 * labeled alternative in {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTLInteger(TestLangParser.TLIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLInteger}
	 * labeled alternative in {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTLInteger(TestLangParser.TLIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TLBoolean}
	 * labeled alternative in {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTLBoolean(TestLangParser.TLBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TLBoolean}
	 * labeled alternative in {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTLBoolean(TestLangParser.TLBooleanContext ctx);
}