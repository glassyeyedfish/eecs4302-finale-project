package proglang.visitor;

import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.FunctionContext;
import proglang.model.BooleanFunction;
import proglang.model.IntegerFunction;
import proglang.model.PLDeclaration;
import proglang.model.PLFunction;
import proglang.model.PLProgram;
import proglang.model.PLStatement;
import proglang.model.PLVoidFunction;
import proglang.model.PLReturn;

public class AntlrToFunction extends ProgLangBaseVisitor<PLFunction<?>> {

	private List<String> semanticErrors;
	private AntlrToStatement antlrToStatement;
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
					return visitIntFunction(ctx, new IntegerFunction(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine()));
				case "BOOL":
					return visitBoolFunction(ctx, new BooleanFunction(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine()));
				default:
					semanticErrors.add("Error: Invalid function return type (line " + ctx.start.getLine() + ")");
					return null;
			}
		}
		else {
			return visitVoidFunction(ctx, new PLVoidFunction(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine()));
		}
	}
	
	@SuppressWarnings("unchecked")
	private PLFunction<Integer> visitIntFunction(FunctionContext ctx, PLFunction<Integer> func) {
		antlrToStatement = new AntlrToStatement(semanticErrors, func, parentProg);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLStatement stmt = antlrToStatement.visit(ctx.getChild(i));
			if (stmt instanceof PLDeclaration) {
				func.addDeclaration(((PLDeclaration) stmt));
			}
			else if (stmt instanceof PLReturn<?>) {
				func.setReturn((PLReturn<Integer>) stmt);
			}
			else {
				func.addStatement(stmt);
			}
		}
		
		return func;
	}
	
	@SuppressWarnings("unchecked")
	private PLFunction<Boolean> visitBoolFunction(FunctionContext ctx, PLFunction<Boolean> func) {
		antlrToStatement = new AntlrToStatement(semanticErrors, func, parentProg);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLStatement stmt = antlrToStatement.visit(ctx.getChild(i));
			if (stmt instanceof PLDeclaration) {
				func.addDeclaration(((PLDeclaration) stmt));
			}
			else if (stmt instanceof PLReturn<?>) {
				func.setReturn((PLReturn<Boolean>) stmt);
			}
			else {
				func.addStatement(stmt);
			}
		}
		
		return func;
	}
	
	private PLFunction<Void> visitVoidFunction(FunctionContext ctx, PLFunction<Void> func) {
		antlrToStatement = new AntlrToStatement(semanticErrors, func, parentProg);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLStatement stmt = antlrToStatement.visit(ctx.getChild(i));
			if (stmt instanceof PLDeclaration) {
				func.addDeclaration(((PLDeclaration) stmt));
			}
			else if (stmt instanceof PLReturn<?>) {
				semanticErrors.add("Error: void functions cannot have a return statement (line " + func.getStartLineNum() + ")");
			}
			else {
				func.addStatement(stmt);
			}
		}
		
		return func;
	}
}
