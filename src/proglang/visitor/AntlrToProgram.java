package proglang.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.FunctionContext;
import proglang.antlr.ProgLangParser.ProgramContext;
import proglang.model.PLFunction;
import proglang.model.PLProgram;
import proglang.model.PLVoidFunction;

public class AntlrToProgram extends ProgLangBaseVisitor<PLProgram> {

	private List<String> semanticErrors;
	private AntlrToFunction antlrToFunction;
	
	public AntlrToProgram() {
		semanticErrors = new ArrayList<>();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public PLProgram visitProgram(ProgramContext ctx) {
		PLProgram p = new PLProgram(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine());
		
		antlrToFunction = new AntlrToFunction(semanticErrors, p);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLFunction<?> func = antlrToFunction.getFuncSig((FunctionContext) ctx.func(i));
			if (func != null) {
				if (p.getFunctions().keySet().contains(func.getName())) {
					semanticErrors.add("Error: function '" + func.getName() + "' already declared (line: " + func.getStartLineNum() + ").");
				}
				else {
					p.addFunction(func);
				}
			}
		}
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLFunction<?> func = antlrToFunction.visit(ctx.getChild(i));
			if (func != null) {
				func.setParameter(p.getFunctions().get(func.getName()).getParameters());
				p.addFunction(func);
			}
		}
		
		if (!p.getFunctions().keySet().contains("main")) {
			semanticErrors.add("Error: program is missing function 'main'.");
		}
		else {
			if (!p.getFunctions().get("main").getParameters().isEmpty()) {
				semanticErrors.add("Error: function 'main' cannot have any parameters.");
			}
			if (!(p.getFunctions().get("main") instanceof PLVoidFunction)) {
				semanticErrors.add("Error: function 'main' cannot have a return type.");
			}
		}
		
		return p;
	}

	public List<String> getSemanticErrors() {
		return semanticErrors;
	}
	
}
