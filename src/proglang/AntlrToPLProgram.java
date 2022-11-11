package proglang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import progantlr.ProgLangBaseVisitor;
import progantlr.ProgLangParser.ElseblockContext;
import progantlr.ProgLangParser.ElseifblockContext;
import progantlr.ProgLangParser.PLAdditionContext;
import progantlr.ProgLangParser.PLAddsubFallthroughContext;
import progantlr.ProgLangParser.PLAndContext;
import progantlr.ProgLangParser.PLAndFallthroughContext;
import progantlr.ProgLangParser.PLAssignmnetContext;
import progantlr.ProgLangParser.PLBoolLiteralContext;
import progantlr.ProgLangParser.PLBracketsContext;
import progantlr.ProgLangParser.PLCosContext;
import progantlr.ProgLangParser.PLDeclarationContext;
import progantlr.ProgLangParser.PLDivisionContext;
import progantlr.ProgLangParser.PLEqFallthroughContext;
import progantlr.ProgLangParser.PLEqualsContext;
import progantlr.ProgLangParser.PLExpFallthroughContext;
import progantlr.ProgLangParser.PLExponentContext;
import progantlr.ProgLangParser.PLFloatLiteralContext;
import progantlr.ProgLangParser.PLGreaterEqualsContext;
import progantlr.ProgLangParser.PLGreaterThanContext;
import progantlr.ProgLangParser.PLIfBlockContext;
import progantlr.ProgLangParser.PLIneqFallthroughContext;
import progantlr.ProgLangParser.PLIntLiteralContext;
import progantlr.ProgLangParser.PLLessEqualsContext;
import progantlr.ProgLangParser.PLLessThanContext;
import progantlr.ProgLangParser.PLLogContext;
import progantlr.ProgLangParser.PLMuldivFallthroughContext;
import progantlr.ProgLangParser.PLMutiplicationContext;
import progantlr.ProgLangParser.PLNotContext;
import progantlr.ProgLangParser.PLNotEqualsContext;
import progantlr.ProgLangParser.PLOrContext;
import progantlr.ProgLangParser.PLOrFallthroughContext;
import progantlr.ProgLangParser.PLPrintContext;
import progantlr.ProgLangParser.PLProgramContext;
import progantlr.ProgLangParser.PLSinContext;
import progantlr.ProgLangParser.PLSubtractionContext;
import progantlr.ProgLangParser.PLTanContext;
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
	
	public AntlrToPLProgram() {
		super();
		this.currentLineNum = 1;
		this.semanticErrors = new ArrayList<>();
		this.vars = new ArrayList<>();
		this.varToTypeMap = new HashMap<>();
	}
	
	
	
	// FUNCTION FOR TYPE CHECKING /////////////////////////////////////////////
	
	
	
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
	
	
	
	// END OF FUNCTIONS FOR TYPE CHECKING //////////////////////////////////////
	
	
	
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
	public PLPrint visitPLPrint(PLPrintContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLPrint(ctx);
	}
	
	
	/// IF BLOCK STUFF ///////////////////////////////////////////////////////
	

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
	public AbstractPLStatement visitElseifblock(ElseifblockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElseifblock(ctx);
	}

	@Override
	public AbstractPLStatement visitElseblock(ElseblockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElseblock(ctx);
	}
	
	
	/// EXPRESSION NON-TERMINALS /////////////////////////////////////////////

	
	
	// ||
	@Override
	public PLOr visitPLOr(PLOrContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLOr(ctx);
	}
	
	@Override
	public AbstractPLStatement visitPLOrFallthrough(PLOrFallthroughContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLOrFallthrough(ctx);
	}

	
	
	// &&
	@Override
	public PLAnd visitPLAnd(PLAndContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLAnd(ctx);
	}

	@Override
	public AbstractPLStatement visitPLAndFallthrough(PLAndFallthroughContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLAndFallthrough(ctx);
	}

	@Override
	public AbstractPLStatement visitPLEquals(PLEqualsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLEquals(ctx);
	}

	
	
	// ==, !=
	@Override
	public PLEquals visitPLEqFallthrough(PLEqFallthroughContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLEqFallthrough(ctx);
	}
	
	@Override
	public PLNotEquals visitPLNotEquals(PLNotEqualsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLNotEquals(ctx);
	}

	
	
	// <, >, <=, >=
	@Override
	public PLLessThan visitPLLessThan(PLLessThanContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLLessThan(ctx);
	}
	
	@Override
	public PLGreaterThan visitPLGreaterThan(PLGreaterThanContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLGreaterThan(ctx);
	}

	@Override
	public AbstractPLStatement visitPLLessEquals(PLLessEqualsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLLessEquals(ctx);
	}

	@Override
	public AbstractPLStatement visitPLGreaterEquals(PLGreaterEqualsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLGreaterEquals(ctx);
	}

	@Override
	public AbstractPLStatement visitPLIneqFallthrough(PLIneqFallthroughContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLIneqFallthrough(ctx);
	}
	
	
	
	// +, -
	@Override
	public PLAddition visitPLAddition(PLAdditionContext ctx) {
		PLAddition add = new PLAddition(
				this.visit(ctx.expr_addsub()),
				this.visit(ctx.expr_muldiv()));
		add.lineNum = this.currentLineNum;
		
		return add;
	}
	
	@Override
	public AbstractPLStatement visitPLSubtraction(PLSubtractionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLSubtraction(ctx);
	}
	
	@Override
	public AbstractPLStatement visitPLAddsubFallthrough(PLAddsubFallthroughContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLAddsubFallthrough(ctx);
	}
	
	
	
	// *, /
	@Override
	public AbstractPLStatement visitPLMutiplication(PLMutiplicationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLMutiplication(ctx);
	}

	@Override
	public AbstractPLStatement visitPLDivision(PLDivisionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLDivision(ctx);
	}

	@Override
	public AbstractPLStatement visitPLMuldivFallthrough(PLMuldivFallthroughContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLMuldivFallthrough(ctx);
	}

	
	
	// **
	@Override
	public AbstractPLStatement visitPLExponent(PLExponentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLExponent(ctx);
	}

	@Override
	public AbstractPLStatement visitPLExpFallthrough(PLExpFallthroughContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLExpFallthrough(ctx);
	}

	// unary, terminals
	@Override
	public AbstractPLStatement visitPLBrackets(PLBracketsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLBrackets(ctx);
	}

	@Override
	public AbstractPLStatement visitPLNot(PLNotContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLNot(ctx);
	}

	@Override
	public AbstractPLStatement visitPLLog(PLLogContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLLog(ctx);
	}

	@Override
	public AbstractPLStatement visitPLSin(PLSinContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLSin(ctx);
	}

	@Override
	public AbstractPLStatement visitPLCos(PLCosContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLCos(ctx);
	}

	@Override
	public AbstractPLStatement visitPLTan(PLTanContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLTan(ctx);
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
	public AbstractPLStatement visitPLFloatLiteral(PLFloatLiteralContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPLFloatLiteral(ctx);
	}

	@Override
	public PLIntLiteral visitPLIntLiteral(PLIntLiteralContext ctx) {
		PLIntLiteral lit = new PLIntLiteral(
				Integer.parseInt(ctx.INT_LIT().getText()));
		lit.lineNum = this.currentLineNum;
	
		return lit;
	}
	
	@Override
	public PLBoolLiteral visitPLBoolLiteral(PLBoolLiteralContext ctx) {
		PLBoolLiteral lit = new PLBoolLiteral(
				ctx.BOOL_LIT().getText().equals("TRUE") ? true : false);
		lit.lineNum = this.currentLineNum;
	
		return lit;
	}
}
