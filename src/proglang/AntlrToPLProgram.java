package proglang;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import progantlr.ProgLangBaseVisitor;
import progantlr.ProgLangParser.PLAdditionContext;
import progantlr.ProgLangParser.PLAssignmnetContext;
import progantlr.ProgLangParser.PLBoolLiteralContext;
import progantlr.ProgLangParser.PLDeclarationContext;
import progantlr.ProgLangParser.PLIfBlockContext;
import progantlr.ProgLangParser.PLIntLiteralContext;
import progantlr.ProgLangParser.PLProgramContext;
import progantlr.ProgLangParser.PLVariableContext;

public class AntlrToPLProgram extends ProgLangBaseVisitor<AbstractPLStatement> {
	
	public List<String> semanticErrors;
	public List<String> vars;
	
	/* List of currently checked semantic errors:
	 * 	- variable has already been declared
	 */
	
	public AntlrToPLProgram() {
		super();
		this.semanticErrors = new ArrayList<>();
		this.vars = new ArrayList<>();
	}
	
	@Override
	public PLProgram visitPLProgram(PLProgramContext ctx) {
		PLProgram prog = new PLProgram(ctx.ID().getText());
		
		for (int i = 2; i < ctx.getChildCount() - 2; i++) {
			prog.statements.add(this.visit(ctx.getChild(i)));
		}
		
		return prog;
	}

	@Override
	public PLDeclaration visitPLDeclaration(PLDeclarationContext ctx) {
		String declId = ctx.ID().getText();
		// Check if var is already declared.
		if (vars.contains(declId)) {
			Token idToken = ctx.ID().getSymbol();
			int line = idToken.getLine();
			int col = idToken.getCharPositionInLine() + 1;
			
			semanticErrors.add(
					"Error: variable '"
					+ declId
					+ "' already declared ("
					+ line 
					+ ", " 
					+ col 
					+ ")");
		} else {
			vars.add(declId);
		}
		
		PLDeclaration decl = new PLDeclaration(
				ctx.TYPE().getText(),
				ctx.ID().getText());
		
		return decl;
	}

	@Override
	public PLAssignment visitPLAssignmnet(PLAssignmnetContext ctx) {
		PLAssignment assign = new PLAssignment(
				ctx.ID().getText(),
				this.visit(ctx.expr()));
		
		return assign;
	}

	@Override
	public PLBoolLiteral visitPLBoolLiteral(PLBoolLiteralContext ctx) {
		PLBoolLiteral lit = new PLBoolLiteral(
				ctx.BOOL_LIT().getText().equals("TRUE") ? true : false);
	
		return lit;
	}

	@Override
	public PLVariable visitPLVariable(PLVariableContext ctx) {
		PLVariable lit = new PLVariable(ctx.ID().getText());
	
		return lit;
	}

	@Override
	public PLIfBlock visitPLIfBlock(PLIfBlockContext ctx) {
		PLIfBlock ifblock = new PLIfBlock(
				this.visit(ctx.expr()));
		
		for (int i = 3; i < ctx.getChildCount() - 1; i++) {
			ifblock.statements.add(
					this.visit(ctx.getChild(i)));
		}
		
		return ifblock;
	}

	@Override
	public PLAddition visitPLAddition(PLAdditionContext ctx) {
		PLAddition add = new PLAddition(
				this.visit(ctx.expr(0)),
				this.visit(ctx.expr(1)));
		
		return add;
	}

	@Override
	public PLIntLiteral visitPLIntLiteral(PLIntLiteralContext ctx) {
		PLIntLiteral lit = new PLIntLiteral(
				Integer.parseInt(ctx.INT_LIT().getText()));
	
		return lit;
	}
}
