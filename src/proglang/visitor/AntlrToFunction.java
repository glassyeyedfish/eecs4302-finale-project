package proglang.visitor;

import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.AttributeDeclContext;
import proglang.antlr.ProgLangParser.FunctionContext;
import proglang.model.PLBooleanFunction;
import proglang.model.PLDeclaration;
import proglang.model.PLFunction;
import proglang.model.PLIntegerFunction;
import proglang.model.PLProgram;
import proglang.model.PLReturn;
import proglang.model.PLStatement;
import proglang.model.PLVoidFunction;
import proglang.model.expressions.PLArithmeticExpression;
import proglang.model.expressions.PLBooleanExpression;
import proglang.model.expressions.PLExpression;

public class AntlrToFunction extends ProgLangBaseVisitor<PLFunction<?>> {

	private List<String> semanticErrors;
	private AntlrToStatement antlrToStatement;
	private AntlrToExpression antlrToExpression;
	private PLProgram parentProg;
	
	public AntlrToFunction(List<String> semanticErrors, PLProgram parentProg) {
		this.semanticErrors = semanticErrors;
		this.parentProg = parentProg;
	}

	@Override
	public PLFunction<?> visitFunction(FunctionContext ctx) {
		if (ctx.TYPE() != null) {
			switch (ctx.TYPE().getText()) {
				case "INT":
					return visitIntFunction(ctx, new PLIntegerFunction(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine()));
				case "BOOL":
					return visitBoolFunction(ctx, new PLBooleanFunction(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine()));
				default:
					semanticErrors.add("Error: Invalid function return type (line " + ctx.start.getLine() + ").");
					return null;
			}
		}
		else {
			return visitVoidFunction(ctx, new PLVoidFunction(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine()));
		}
	}
	
	private PLFunction<Integer> visitIntFunction(FunctionContext ctx, PLFunction<Integer> func) {
		antlrToStatement = new AntlrToStatement(semanticErrors, func, parentProg);
		antlrToExpression = new AntlrToExpression(semanticErrors, func, parentProg);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLStatement stmt = antlrToStatement.visit(ctx.getChild(i));
			if (stmt instanceof PLDeclaration) {
				func.addDeclaration(((PLDeclaration) stmt));
			}
			else if (stmt instanceof PLStatement) {
				func.addStatement(stmt);
			}
		}
			
		if (ctx.expr() != null) {
			PLExpression<?> expression = antlrToExpression.visit(ctx.expr());
			if (expression instanceof PLArithmeticExpression) {
				func.setReturn(new PLReturn<Integer>((PLArithmeticExpression) expression, ctx.expr().getStart().getLine()));
			}
			else {
				semanticErrors.add("Error: type mismatch function '" + func.getName() + "' must return an int (line " + func.getStartLineNum() + ").");
			}
		}
		else {
			semanticErrors.add("Error: function '" + func.getName() + "' with return type INT, must have return statement (line " + func.getStartLineNum() + ").");
		}
		
		return func;
	}
	
	private PLFunction<Boolean> visitBoolFunction(FunctionContext ctx, PLFunction<Boolean> func) {
		antlrToStatement = new AntlrToStatement(semanticErrors, func, parentProg);
		antlrToExpression = new AntlrToExpression(semanticErrors, func, parentProg);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLStatement stmt = antlrToStatement.visit(ctx.getChild(i));
			if (stmt instanceof PLDeclaration) {
				func.addDeclaration(((PLDeclaration) stmt));
			}
			else if (stmt instanceof PLStatement)  {
				func.addStatement(stmt);
			}
		}
		
		if (ctx.expr() != null) {
			PLExpression<?> expression = antlrToExpression.visit(ctx.expr());
			if (expression instanceof PLBooleanExpression) {
				func.setReturn(new PLReturn<Boolean>((PLBooleanExpression) expression, ctx.expr().getStart().getLine()));
			}
			else {
				semanticErrors.add("Error: type mismatch function '" + func.getName() + "' must return an bool (line " + func.getStartLineNum() + ").");
			}
		}
		else {
			semanticErrors.add("Error: function '" + func.getName() + "' with return type BOOL, must have return statement (line " + func.getStartLineNum() + ").");
		}
		
		return func;
	}
	
	private PLFunction<Void> visitVoidFunction(FunctionContext ctx, PLFunction<Void> func) {
		antlrToStatement = new AntlrToStatement(semanticErrors, func, parentProg);
		antlrToExpression = new AntlrToExpression(semanticErrors, func, parentProg);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLStatement stmt = antlrToStatement.visit(ctx.getChild(i));
			if (stmt instanceof PLDeclaration) {
				func.addDeclaration(((PLDeclaration) stmt));
			}
			else {
				func.addStatement(stmt);
			}
		}
		
		if (ctx.expr() != null) {
			semanticErrors.add("Error: function '" + func.getName() + "' without a return type, cannot have a return statement (line " + func.getStartLineNum() + ").");
		}
		
		return func;
	}
	
	public PLFunction<?> getFuncSig(FunctionContext ctx) {
		if (ctx != null) {
			if (ctx.TYPE() != null) {
				if (ctx.TYPE().getText().equals("INT")) {
					PLIntegerFunction func = new PLIntegerFunction(ctx.ID().getText(), ctx.start.getLine(), ctx.stop.getLine());
					
					for (int i = 0; i < ctx.attr_decl().size(); i++) {
						if (func.getStartLineNum() == ctx.attr_decl(i).getStart().getLine()) {
							func.addParameter(((AttributeDeclContext) ctx.attr_decl(i)).ID().getText(), ((AttributeDeclContext) ctx.attr_decl(i)).TYPE().getText());
						}
					}
					
					return func;
				}
				else if (ctx.TYPE().getText().equals("BOOL")) {
					PLBooleanFunction func = new PLBooleanFunction(ctx.ID().getText(), ctx.start.getLine(), ctx.stop.getLine());
					
					for (int i = 0; i < ctx.attr_decl().size(); i++) {
						if (func.getStartLineNum() == ctx.attr_decl(i).getStart().getLine()) {
							func.addParameter(((AttributeDeclContext) ctx.attr_decl(i)).ID().getText(), ((AttributeDeclContext) ctx.attr_decl(i)).TYPE().getText());
						}
					}
					
					return func;
				}
			}
			else {
				PLVoidFunction func = new PLVoidFunction(ctx.ID().getText(), ctx.start.getLine(), ctx.stop.getLine());
				
				for (int i = 0; i < ctx.attr_decl().size(); i++) {
					if (func.getStartLineNum() == ctx.attr_decl(i).getStart().getLine()) {
						func.addParameter(((AttributeDeclContext) ctx.attr_decl(i)).ID().getText(), ((AttributeDeclContext) ctx.attr_decl(i)).TYPE().getText());
					}
				}
				
				return func;
			}
		}
		return null;
	}
}
