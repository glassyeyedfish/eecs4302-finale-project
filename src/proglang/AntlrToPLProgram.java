package proglang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public int currentLineNum;
	public List<String> semanticErrors;
	public List<String> vars;
	public Map<String, String> varToTypeMap;
	
	/*
	 * TODO:
	 * 	- Finish implementing
	 */
	
	/* List of currently checked semantic errors:
	 * 	- variable has already been declared
	 * 	- using undeclared variable
	 *  - type mismatch errors:
	 *  	- using wrong type with operation
	 *  	- if statement condition must be bool
	 *  	- assigning wrong type to variable
	 */
	
	/* List of possible semantic errors to be checked:
	 *  - variable used before assigned (ideally this one is not needed)
	 */
	
	public AntlrToPLProgram() {
		super();
		this.currentLineNum = 1;
		this.semanticErrors = new ArrayList<>();
		this.vars = new ArrayList<>();
		this.varToTypeMap = new HashMap<>();
	}
	
	// FUNCTION FOR TYPE CHECKING
	
	// Returns the type of an expression (BOOL, INT) or (ERROR) if there was
	// a type mismatch
	// Checks the following type errors:
	// 	- Using wrong type with operation
	private String checkExprType(AbstractPLStatement expr) {
		if (expr instanceof PLAddition) {
			String leftType = checkExprType(((PLAddition) expr).left);
			String rightType = checkExprType(((PLAddition) expr).right);
			if (leftType.equals("INT") && rightType.equals("INT")) {
				return "INT";
			} else {
				this.semanticErrors.add(
						"Type Error: must use INT with '+' at line: "
						+ expr.lineNum);
				return "ERROR";
			}
		} else if (expr instanceof PLVariable) {
			return varToTypeMap.get(((PLVariable) expr).id);
		} else if (expr instanceof PLIntLiteral) {
			return "INT";
		} else if (expr instanceof PLBoolLiteral) {
			return "BOOL";
		}
			
		// This should NEVER be reached!
		return null;
	}
	
	// Checks the following type errors:
	//	- if statement condition must be bool
	//  - assigning wrong type to variable
	private void checkTypeErrors(AbstractPLStatement s) {
		if (s instanceof PLProgram) {
			// Check all statements in the program for type errors
			for (AbstractPLStatement statement: ((PLProgram) s).statements) {
				checkTypeErrors(statement);
			}
		} else if (s instanceof PLIfBlock) {
			// Check if condition in if-statement is a boolean
			if (
				!checkExprType(((PLIfBlock) s).condition).equals("BOOL")
			) {
				this.semanticErrors.add(
						"Type Error: if statement condition must be BOOL at: " 
						+ s.lineNum);
			}
			// Next, check all statements inside the if block for type errors
			for (AbstractPLStatement statement: ((PLIfBlock) s).statements) {
				checkTypeErrors(statement);
			}
		} else if (s instanceof PLAssignment) {
			// Check if value being assigned has the correct type
			if (
				!checkExprType(((PLAssignment) s).expr).equals(
				varToTypeMap.get(((PLAssignment) s).id))
			) {
				this.semanticErrors.add(
						"Type Error: type mismatch at line: " + s.lineNum);
			}
		}
	}
	
	// END OF FUNCTIONS FOR TYPE CHECKING
	
	@Override
	public PLProgram visitPLProgram(PLProgramContext ctx) {
		PLProgram prog = new PLProgram(ctx.ID().getText());
		prog.lineNum = this.currentLineNum;
		
		// Visit the tree and grab all the statements.
		// - variable has already been declared
		// - using undeclared variable
		// checked at this step
		for (int i = 2; i < ctx.getChildCount() - 2; i++) {
			this.currentLineNum++;
			prog.statements.add(this.visit(ctx.getChild(i)));
		}
		
		// If there are no semantic errors so far, meaning that all vars are
		// being declared and used properly, that means we can try
		// checking for type errors
		if (this.semanticErrors.isEmpty()) {
			checkTypeErrors(prog);
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
		
		// Generate statement to be returned
		PLDeclaration decl = new PLDeclaration(
				ctx.TYPE().getText(),
				ctx.ID().getText());
		decl.lineNum = this.currentLineNum;
		
		// Add type to map
		varToTypeMap.put(declId, ctx.TYPE().getText());
		
		return decl;
	}

	@Override
	public PLAssignment visitPLAssignmnet(PLAssignmnetContext ctx) {
		String varId = ctx.ID().getText();
		
		// Check if variable being used has been declared
		if (!vars.contains(varId)) {
			Token idToken = ctx.ID().getSymbol();
			int line = idToken.getLine();
			int col = idToken.getCharPositionInLine() + 1;
			
			semanticErrors.add(
					"Error: variable '"
					+ varId
					+ "' has not been declared ("
					+ line 
					+ ", " 
					+ col 
					+ ")");
		}
		
		PLAssignment assign = new PLAssignment(
				varId,
				this.visit(ctx.expr()));
		assign.lineNum = this.currentLineNum;
		
		return assign;
	}

	@Override
	public PLBoolLiteral visitPLBoolLiteral(PLBoolLiteralContext ctx) {
		PLBoolLiteral lit = new PLBoolLiteral(
				ctx.BOOL_LIT().getText().equals("TRUE") ? true : false);
		lit.lineNum = this.currentLineNum;
	
		return lit;
	}

	@Override
	public PLVariable visitPLVariable(PLVariableContext ctx) {
		String varId = ctx.ID().getText();
		
		// Check if variable being used has been declared
		if (!vars.contains(varId)) {
			Token idToken = ctx.ID().getSymbol();
			int line = idToken.getLine();
			int col = idToken.getCharPositionInLine() + 1;
			
			semanticErrors.add(
					"Error: variable '"
					+ varId
					+ "' has not been declared ("
					+ line 
					+ ", " 
					+ col 
					+ ")");
		}
		
		PLVariable var = new PLVariable(varId);
		var.lineNum = this.currentLineNum;
	
		return var;
	}

	@Override
	public PLIfBlock visitPLIfBlock(PLIfBlockContext ctx) {
		PLIfBlock ifblock = new PLIfBlock(
				this.visit(ctx.expr()));
		ifblock.lineNum = this.currentLineNum;
		
		for (int i = 3; i < ctx.getChildCount() - 1; i++) {
			this.currentLineNum++;
			ifblock.statements.add(
					this.visit(ctx.getChild(i)));
		}
		
		this.currentLineNum++;
		
		return ifblock;
	}

	@Override
	public PLAddition visitPLAddition(PLAdditionContext ctx) {
		PLAddition add = new PLAddition(
				this.visit(ctx.expr_addsub()),
				this.visit(ctx.expr_muldiv()));
		add.lineNum = this.currentLineNum;
		
		return add;
	}

	@Override
	public PLIntLiteral visitPLIntLiteral(PLIntLiteralContext ctx) {
		PLIntLiteral lit = new PLIntLiteral(
				Integer.parseInt(ctx.INT_LIT().getText()));
		lit.lineNum = this.currentLineNum;
	
		return lit;
	}
}
