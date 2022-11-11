// Generated from ProgLang.g4 by ANTLR 4.9.3

	package progantlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code PLProgram}
	 * labeled alternative in {@link ProgLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLProgram(ProgLangParser.PLProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLFunction}
	 * labeled alternative in {@link ProgLangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLFunction(ProgLangParser.PLFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgLangParser#func_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_sig(ProgLangParser.Func_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgLangParser#func_sig_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_sig_decl(ProgLangParser.Func_sig_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLDeclaration}
	 * labeled alternative in {@link ProgLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLDeclaration(ProgLangParser.PLDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAssignment}
	 * labeled alternative in {@link ProgLangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAssignment(ProgLangParser.PLAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLPrint}
	 * labeled alternative in {@link ProgLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLPrint(ProgLangParser.PLPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLConditional}
	 * labeled alternative in {@link ProgLangParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLConditional(ProgLangParser.PLConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgLangParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifblock(ProgLangParser.ElseifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgLangParser#elseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseblock(ProgLangParser.ElseblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLOrFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLOrFallthrough(ProgLangParser.PLOrFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLOr}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLOr(ProgLangParser.PLOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAnd}
	 * labeled alternative in {@link ProgLangParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAnd(ProgLangParser.PLAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAndFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAndFallthrough(ProgLangParser.PLAndFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLEqualFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLEqualFallthrough(ProgLangParser.PLEqualFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLNotEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLNotEqualTo(ProgLangParser.PLNotEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLEqualTo(ProgLangParser.PLEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLGreaterThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLGreaterThan(ProgLangParser.PLGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLComparisonFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLComparisonFallthrough(ProgLangParser.PLComparisonFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLLessThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLLessThanOrEqualTo(ProgLangParser.PLLessThanOrEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLLessThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLLessThan(ProgLangParser.PLLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLGreaterThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLGreaterThanOrEqualTo(ProgLangParser.PLGreaterThanOrEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAddSubFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAddSubFallthrough(ProgLangParser.PLAddSubFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAddition}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAddition(ProgLangParser.PLAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLSubtraction}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLSubtraction(ProgLangParser.PLSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLMultFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLMultFallthrough(ProgLangParser.PLMultFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLMultiplication}
	 * labeled alternative in {@link ProgLangParser#expr_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLMultiplication(ProgLangParser.PLMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLBrackets}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLBrackets(ProgLangParser.PLBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLNot}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLNot(ProgLangParser.PLNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLVariable}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLVariable(ProgLangParser.PLVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLInteger}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLInteger(ProgLangParser.PLIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLBoolean}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLBoolean(ProgLangParser.PLBooleanContext ctx);
}