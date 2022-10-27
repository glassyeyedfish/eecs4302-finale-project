package proglang;

import java.util.ArrayList;
import java.util.List;

import antlr.ProgLangBaseVisitor;
import antlr.ProgLangParser.PLAdditionContext;
import antlr.ProgLangParser.PLAssignmnetContext;
import antlr.ProgLangParser.PLBoolLiteralContext;
import antlr.ProgLangParser.PLDeclarationContext;
import antlr.ProgLangParser.PLIfBlockContext;
import antlr.ProgLangParser.PLIntLiteralContext;
import antlr.ProgLangParser.PLProgramContext;
import antlr.ProgLangParser.PLVariableContext;

public class AntlrToPLProgram extends ProgLangBaseVisitor<AbstractPLStatement> {
	
	public List<String> semanticErrors;
	
	public AntlrToPLProgram() {
		super();
		this.semanticErrors = new ArrayList<>();
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
