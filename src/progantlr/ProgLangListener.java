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
	 * Enter a parse tree produced by the {@code PLFunction}
	 * labeled alternative in {@link ProgLangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterPLFunction(ProgLangParser.PLFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLFunction}
	 * labeled alternative in {@link ProgLangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitPLFunction(ProgLangParser.PLFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgLangParser#func_sig}.
	 * @param ctx the parse tree
	 */
	void enterFunc_sig(ProgLangParser.Func_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgLangParser#func_sig}.
	 * @param ctx the parse tree
	 */
	void exitFunc_sig(ProgLangParser.Func_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgLangParser#func_sig_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_sig_decl(ProgLangParser.Func_sig_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgLangParser#func_sig_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_sig_decl(ProgLangParser.Func_sig_declContext ctx);
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
	 * Enter a parse tree produced by the {@code PLAssignment}
	 * labeled alternative in {@link ProgLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterPLAssignment(ProgLangParser.PLAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAssignment}
	 * labeled alternative in {@link ProgLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitPLAssignment(ProgLangParser.PLAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLPrint}
	 * labeled alternative in {@link ProgLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPLPrint(ProgLangParser.PLPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLPrint}
	 * labeled alternative in {@link ProgLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPLPrint(ProgLangParser.PLPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLConditional}
	 * labeled alternative in {@link ProgLangParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterPLConditional(ProgLangParser.PLConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLConditional}
	 * labeled alternative in {@link ProgLangParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitPLConditional(ProgLangParser.PLConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgLangParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void enterElseifblock(ProgLangParser.ElseifblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgLangParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void exitElseifblock(ProgLangParser.ElseifblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgLangParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void enterElseblock(ProgLangParser.ElseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgLangParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void exitElseblock(ProgLangParser.ElseblockContext ctx);
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
	 * Enter a parse tree produced by the {@code PLEqualFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterPLEqualFallthrough(ProgLangParser.PLEqualFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLEqualFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitPLEqualFallthrough(ProgLangParser.PLEqualFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLNotEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterPLNotEqualTo(ProgLangParser.PLNotEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLNotEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitPLNotEqualTo(ProgLangParser.PLNotEqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterPLEqualTo(ProgLangParser.PLEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitPLEqualTo(ProgLangParser.PLEqualToContext ctx);
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
	 * Enter a parse tree produced by the {@code PLComparisonFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLComparisonFallthrough(ProgLangParser.PLComparisonFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLComparisonFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLComparisonFallthrough(ProgLangParser.PLComparisonFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLLessThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLLessThanOrEqualTo(ProgLangParser.PLLessThanOrEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLLessThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLLessThanOrEqualTo(ProgLangParser.PLLessThanOrEqualToContext ctx);
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
	 * Enter a parse tree produced by the {@code PLGreaterThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void enterPLGreaterThanOrEqualTo(ProgLangParser.PLGreaterThanOrEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLGreaterThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr_ineq}.
	 * @param ctx the parse tree
	 */
	void exitPLGreaterThanOrEqualTo(ProgLangParser.PLGreaterThanOrEqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLAddSubFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void enterPLAddSubFallthrough(ProgLangParser.PLAddSubFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAddSubFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_addsub}.
	 * @param ctx the parse tree
	 */
	void exitPLAddSubFallthrough(ProgLangParser.PLAddSubFallthroughContext ctx);
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
	 * Enter a parse tree produced by the {@code PLMultFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterPLMultFallthrough(ProgLangParser.PLMultFallthroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLMultFallthrough}
	 * labeled alternative in {@link ProgLangParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitPLMultFallthrough(ProgLangParser.PLMultFallthroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLMultiplication}
	 * labeled alternative in {@link ProgLangParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterPLMultiplication(ProgLangParser.PLMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLMultiplication}
	 * labeled alternative in {@link ProgLangParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitPLMultiplication(ProgLangParser.PLMultiplicationContext ctx);
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
	 * Enter a parse tree produced by the {@code PLInteger}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLInteger(ProgLangParser.PLIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLInteger}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLInteger(ProgLangParser.PLIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLBoolean}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterPLBoolean(ProgLangParser.PLBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLBoolean}
	 * labeled alternative in {@link ProgLangParser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitPLBoolean(ProgLangParser.PLBooleanContext ctx);
}