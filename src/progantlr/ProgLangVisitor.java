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
	 * Visit a parse tree produced by the {@code PLDeclaration}
	 * labeled alternative in {@link ProgLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLDeclaration(ProgLangParser.PLDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAssignmnet}
	 * labeled alternative in {@link ProgLangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAssignmnet(ProgLangParser.PLAssignmnetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLIfBlock}
	 * labeled alternative in {@link ProgLangParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLIfBlock(ProgLangParser.PLIfBlockContext ctx);
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
	 * Visit a parse tree produced by the {@code PLEqFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLEqFallthrough(ProgLangParser.PLEqFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLNotEquals}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLNotEquals(ProgLangParser.PLNotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLEquals}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLEquals(ProgLangParser.PLEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLIneqFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLIneqFallthrough(ProgLangParser.PLIneqFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLGreaterThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLGreaterThan(ProgLangParser.PLGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLLessEquals}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLLessEquals(ProgLangParser.PLLessEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLLessThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLLessThan(ProgLangParser.PLLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLGreaterEquals}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLGreaterEquals(ProgLangParser.PLGreaterEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAddition}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAddition(ProgLangParser.PLAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAddsubFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAddsubFallthrough(ProgLangParser.PLAddsubFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLSubtraction}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLSubtraction(ProgLangParser.PLSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLMuldivFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLMuldivFallthrough(ProgLangParser.PLMuldivFallthroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLDivision}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLDivision(ProgLangParser.PLDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLMutiplication}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLMutiplication(ProgLangParser.PLMutiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLExponent}
	 * labeled alternative in {@link ProgLangParser#expr_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLExponent(ProgLangParser.PLExponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLExpFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLExpFallthrough(ProgLangParser.PLExpFallthroughContext ctx);
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
	 * Visit a parse tree produced by the {@code PLLog}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLLog(ProgLangParser.PLLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLSin}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLSin(ProgLangParser.PLSinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLCos}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLCos(ProgLangParser.PLCosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLTan}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLTan(ProgLangParser.PLTanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLVariable}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLVariable(ProgLangParser.PLVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLIntLiteral}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLIntLiteral(ProgLangParser.PLIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLBoolLiteral}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLBoolLiteral(ProgLangParser.PLBoolLiteralContext ctx);
}