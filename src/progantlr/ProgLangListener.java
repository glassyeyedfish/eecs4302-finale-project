// Generated from ProgLang.g4 by ANTLR 4.9.3

	package progantlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgLangParser}.
 */
public interface ProgLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code PLProgram}
	 * labeled alternative in {@link ProgLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterPLProgram(ProgLangParser.PLProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLProgram}
	 * labeled alternative in {@link ProgLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitPLProgram(ProgLangParser.PLProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLDeclaration}
	 * labeled alternative in {@link ProgLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterPLDeclaration(ProgLangParser.PLDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLDeclaration}
	 * labeled alternative in {@link ProgLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitPLDeclaration(ProgLangParser.PLDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLAssignmnet}
	 * labeled alternative in {@link ProgLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterPLAssignmnet(ProgLangParser.PLAssignmnetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAssignmnet}
	 * labeled alternative in {@link ProgLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitPLAssignmnet(ProgLangParser.PLAssignmnetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLIfBlock}
	 * labeled alternative in {@link ProgLangParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterPLIfBlock(ProgLangParser.PLIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLIfBlock}
	 * labeled alternative in {@link ProgLangParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitPLIfBlock(ProgLangParser.PLIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLOrFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLOrFallthrough(ProgLangParser.PLOrFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLOrFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLOrFallthrough(ProgLangParser.PLOrFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLOr}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLOr(ProgLangParser.PLOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLOr}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLOr(ProgLangParser.PLOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLAnd}
	 * labeled alternative in {@link ProgLangParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterPLAnd(ProgLangParser.PLAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAnd}
	 * labeled alternative in {@link ProgLangParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitPLAnd(ProgLangParser.PLAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLAndFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterPLAndFallthrough(ProgLangParser.PLAndFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAndFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitPLAndFallthrough(ProgLangParser.PLAndFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLEqFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterPLEqFallthrough(ProgLangParser.PLEqFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLEqFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitPLEqFallthrough(ProgLangParser.PLEqFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLNotEquals}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterPLNotEquals(ProgLangParser.PLNotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLNotEquals}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitPLNotEquals(ProgLangParser.PLNotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLEquals}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterPLEquals(ProgLangParser.PLEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLEquals}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitPLEquals(ProgLangParser.PLEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLIneqFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLIneqFallthrough(ProgLangParser.PLIneqFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLIneqFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLIneqFallthrough(ProgLangParser.PLIneqFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLGreaterThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLGreaterThan(ProgLangParser.PLGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLGreaterThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLGreaterThan(ProgLangParser.PLGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLLessEquals}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLLessEquals(ProgLangParser.PLLessEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLLessEquals}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLLessEquals(ProgLangParser.PLLessEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLLessThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLLessThan(ProgLangParser.PLLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLLessThan}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLLessThan(ProgLangParser.PLLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLGreaterEquals}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLGreaterEquals(ProgLangParser.PLGreaterEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLGreaterEquals}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLGreaterEquals(ProgLangParser.PLGreaterEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLMuldivFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 */
	void enterPLMuldivFallthrough(ProgLangParser.PLMuldivFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLMuldivFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 */
	void exitPLMuldivFallthrough(ProgLangParser.PLMuldivFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLDivision}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 */
	void enterPLDivision(ProgLangParser.PLDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLDivision}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 */
	void exitPLDivision(ProgLangParser.PLDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLMutiplication}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 */
	void enterPLMutiplication(ProgLangParser.PLMutiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLMutiplication}
	 * labeled alternative in {@link ProgLangParser#expr_muldiv}.
	 * @param ctx the parse tree
	 */
	void exitPLMutiplication(ProgLangParser.PLMutiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLAddition}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void enterPLAddition(ProgLangParser.PLAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAddition}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void exitPLAddition(ProgLangParser.PLAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLAddsubFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void enterPLAddsubFallthrough(ProgLangParser.PLAddsubFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAddsubFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void exitPLAddsubFallthrough(ProgLangParser.PLAddsubFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLSubtraction}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void enterPLSubtraction(ProgLangParser.PLSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLSubtraction}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void exitPLSubtraction(ProgLangParser.PLSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLExponent}
	 * labeled alternative in {@link ProgLangParser#expr_exp}.
	 * @param ctx the parse tree
	 */
	void enterPLExponent(ProgLangParser.PLExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLExponent}
	 * labeled alternative in {@link ProgLangParser#expr_exp}.
	 * @param ctx the parse tree
	 */
	void exitPLExponent(ProgLangParser.PLExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLExoFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_exp}.
	 * @param ctx the parse tree
	 */
	void enterPLExoFallthrough(ProgLangParser.PLExoFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLExoFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_exp}.
	 * @param ctx the parse tree
	 */
	void exitPLExoFallthrough(ProgLangParser.PLExoFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLBrackets}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLBrackets(ProgLangParser.PLBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLBrackets}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLBrackets(ProgLangParser.PLBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLNot}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLNot(ProgLangParser.PLNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLNot}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLNot(ProgLangParser.PLNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLLog}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLLog(ProgLangParser.PLLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLLog}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLLog(ProgLangParser.PLLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLSin}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLSin(ProgLangParser.PLSinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLSin}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLSin(ProgLangParser.PLSinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLCos}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLCos(ProgLangParser.PLCosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLCos}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLCos(ProgLangParser.PLCosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLTan}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLTan(ProgLangParser.PLTanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLTan}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLTan(ProgLangParser.PLTanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLVariable}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLVariable(ProgLangParser.PLVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLVariable}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLVariable(ProgLangParser.PLVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLIntLiteral}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLIntLiteral(ProgLangParser.PLIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLIntLiteral}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLIntLiteral(ProgLangParser.PLIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLBoolLiteral}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLBoolLiteral(ProgLangParser.PLBoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLBoolLiteral}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLBoolLiteral(ProgLangParser.PLBoolLiteralContext ctx);
}