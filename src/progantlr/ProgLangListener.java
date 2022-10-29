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
	 * Enter a parse tree produced by the {@code PLBoolLiteral}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLBoolLiteral(ProgLangParser.PLBoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLBoolLiteral}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLBoolLiteral(ProgLangParser.PLBoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLAddition}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLAddition(ProgLangParser.PLAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLAddition}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLAddition(ProgLangParser.PLAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLVariable}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLVariable(ProgLangParser.PLVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLVariable}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLVariable(ProgLangParser.PLVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLIntLiteral}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLIntLiteral(ProgLangParser.PLIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLIntLiteral}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLIntLiteral(ProgLangParser.PLIntLiteralContext ctx);
}