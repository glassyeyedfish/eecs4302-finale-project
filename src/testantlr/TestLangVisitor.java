// Generated from TestLang.g4 by ANTLR 4.9.3

	package testantlr;

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
	 * Visit a parse tree produced by the {@code TLRun}
	 * labeled alternative in {@link TestLangParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTLRun(TestLangParser.TLRunContext ctx);
}