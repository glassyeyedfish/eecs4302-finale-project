// Generated from TestLang.g4 by ANTLR 4.9.3

	package testlang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code TLProgram}
	 * labeled alternative in {@link TestLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLProgram(TestLangParser.TLProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TLTestFunc}
	 * labeled alternative in {@link TestLangParser#test_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLTestFunc(TestLangParser.TLTestFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TLFunctionCall}
	 * labeled alternative in {@link TestLangParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLFunctionCall(TestLangParser.TLFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TLAssertEquals}
	 * labeled alternative in {@link TestLangParser#assrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLAssertEquals(TestLangParser.TLAssertEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TLAssert}
	 * labeled alternative in {@link TestLangParser#assrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLAssert(TestLangParser.TLAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TLInteger}
	 * labeled alternative in {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLInteger(TestLangParser.TLIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TLBoolean}
	 * labeled alternative in {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLBoolean(TestLangParser.TLBooleanContext ctx);
}