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
	 * Visit a parse tree produced by the {@code PLBoolLiteral}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLBoolLiteral(ProgLangParser.PLBoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAddition}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAddition(ProgLangParser.PLAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLVariable}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLVariable(ProgLangParser.PLVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLIntLiteral}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLIntLiteral(ProgLangParser.PLIntLiteralContext ctx);
}