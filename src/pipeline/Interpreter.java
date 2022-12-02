package pipeline;

import java.util.*;

import proglang.model.*;
import proglang.model.expressions.*;
import testlang.model.*;
import testlang.model.expressions.*;

public class Interpreter {
	
	/*
	 * The treacherous, beating heart of this operation.
	 */
	
	/*
	 * This class simply stores the result from an evaluation that might have
	 * returned either a boolean or integer value.
	 */
	private class EvalResult {
		public boolean isInt;
		public Boolean b;
		public Integer i;
	}
	
	private EvalResult returnResult;
	
	
	
	
	
	
	public Interpreter() {
		this.returnResult = new EvalResult();
	}
	
	/*
	 * Run through each TLProgram test function and populate the following lists:
	 * 
	 *  - coveredDCPaths;
	 *  - coveredStatements;
	 */
	public void interpret(
			TLProgram testProg, 
			PLProgram prog, 
			ProcessorData data
	) {
		/*
		 * Run each test function in the TLProgram
		 */
		for (TLTestFunc testFunc: testProg.getTestFunctions()) {
			/*
			 * Run each function.
			 */
			
			for (TLFunctionCall call: testFunc.getFunctionCalls()) {
				/*
				 * Find the function that needs to be called.
				 */
				PLFunction<?> func = prog.getFunctions().get(call.getName());
				
				/*
				 * Add parameters to the Store
				 */
				Store.push(func.getName());
				int i = 0;
				for (
						Map.Entry<String, String> paramEntry: 
						func.getParameters().entrySet()
				) {
					Store.addVariable(paramEntry.getKey(), paramEntry.getValue());
					Store.pop();
					EvalResult fr = evalExpr(call.getArgs().get(i), prog, data);
					Store.push(func.getName());
					if (paramEntry.getValue().equals("INT")) {
						Store.setVariable(paramEntry.getKey(), fr.i);
					} else {
						Store.setVariable(paramEntry.getKey(), fr.b);
					}
					i++;
				}
				Store.pop();
				
				/*
				 * Run the function
				 */
				interpretTLFunctionCall(call, prog, data);
			}
			
			/*
			 * Run each assertion.
			 */
			for (TLAssertion asrt: testFunc.getAssertions()) {
				interpretTLAssertion(asrt, prog, data);
			}
		}
	}

	
	
	
	
	

	private void interpretTLFunctionCall(
			TLFunctionCall call, 
			PLProgram prog, 
			ProcessorData data
	) {
		/*
		 * Figure out which function from the PLProgram should be called.
		 */
		PLFunction<?> func = prog.getFunctions().get(call.getName());
		
		/*
		 * Run that function.
		 */
		interpretPLFunction(func, prog, data);
	}
	
	
	
	
	

	private void interpretTLAssertion(
			TLAssertion asrt, 
			PLProgram prog, 
			ProcessorData data
	) {
		/*
		 * Figure out which of the following assertion is being tested:
		 * 		- TLAssert
		 * 		- TLAssertEquals
		 */
		if (asrt instanceof TLAssert) {
			TLAssert a = (TLAssert) asrt;
			TLFunctionCall call = a.getLeft();
			
			/*
			 * Find the function that needs to be called.
			 */
			PLFunction<?> func = prog.getFunctions().get(call.getName());
			
			/*
			 * Add parameters to the Store
			 */
			Store.push(func.getName());
			int i = 0;
			for (
					Map.Entry<String, String> paramEntry: 
					func.getParameters().entrySet()
			) {
				Store.addVariable(paramEntry.getKey(), paramEntry.getValue());
				Store.pop();
				EvalResult fr = evalExpr(call.getArgs().get(i), prog, data);
				Store.push(func.getName());
				if (paramEntry.getValue().equals("INT")) {
					Store.setVariable(paramEntry.getKey(), fr.i);
				} else {
					Store.setVariable(paramEntry.getKey(), fr.b);
				}
				i++;
			}
			Store.pop();
			
			/*
			 * Run the function
			 */
			interpretTLFunctionCall(call, prog, data);
			
			/*
			 * Add Assertion Result
			 */
			data.addAssertionResult(
					call.getName(), this.returnResult.b, a.getLineNum());
			
			
			
		} else if (asrt instanceof TLAssertEquals) {
			TLAssertEquals a = (TLAssertEquals) asrt;
			TLFunctionCall call = a.getLeft();
			
			/*
			 * Find the function that needs to be called.
			 */
			PLFunction<?> func = prog.getFunctions().get(call.getName());
			
			/*
			 * Add parameters to the Store
			 */
			Store.push(func.getName());
			int i = 0;
			for (
					Map.Entry<String, String> paramEntry: 
					func.getParameters().entrySet()
			) {
				Store.addVariable(paramEntry.getKey(), paramEntry.getValue());
				Store.pop();
				EvalResult fr = evalExpr(call.getArgs().get(i), prog, data);
				Store.push(func.getName());
				if (paramEntry.getValue().equals("INT")) {
					Store.setVariable(paramEntry.getKey(), fr.i);
				} else {
					Store.setVariable(paramEntry.getKey(), fr.b);
				}
				i++;
			}
			Store.pop();
			
			/*
			 * Run the function
			 */
			interpretTLFunctionCall(call, prog, data);
			
			/*
			 * Add the assertion result.
			 */
			if (this.returnResult.isInt) {
				data.addAssertionResult(
						call.getName(), 
						this.returnResult.i == evalExpr(a.getRight(), prog, data).i, 
						a.getLineNum());
			} else {
				data.addAssertionResult(
						call.getName(), 
						this.returnResult.b == evalExpr(a.getRight(), prog, data).b, 
						a.getLineNum());
				
			}
			
			
			
			
		} else {
			System.err.println("Assertion wasn't accounted for!");
			System.exit(1);
			
		}
	}

	
	
	
	
	
	private void interpretPLFunction(
			PLFunction<?> func, 
			PLProgram prog, 
			ProcessorData data
	) {
		/*
		 * Update Processor Data
		 */
		data.coverStatementAt(func.getStartLineNum());
		
		/*
		 * Push this function onto the call stack!
		 */
		Store.push(func.getName());
		
		/*
		 * Add all declarations to the Store. NOT the parameters.
		 */
		for (
				Map.Entry<String, PLDeclaration> declEntry: 
				func.getVariables().entrySet()
		) {
			if (!func.getParameters().containsKey(declEntry.getKey())) {
				Store.addVariable(declEntry.getKey(), declEntry.getValue().getType());
			}
		}
		
		/*
		 * Run each statement in the function.
		 */
		for (PLStatement stmt: func.getStatements()) {
			interpretPLStatement(stmt, prog, data);
		}
		
		
		/*
		 * Handle return statement.
		 */
		if (func.getRtrnStmt() != null) {
			this.returnResult = evalExpr(func.getRtrnStmt().getExpr(), prog, data);
		}
		
		
		/*
		 * Pop from the call stack.
		 */
		Store.pop();
	}

	
	
	
	
	
	private void interpretPLStatement(
			PLStatement stmt, 
			PLProgram prog, 
			ProcessorData data
	) {
		/*
		 * Update Processor Data
		 */
		data.coverStatementAt(stmt.getLineNum());
		data.coverPathAt(stmt.getLineNum());
		
		/*
		 * Figure out which of the following is the statement being run:
		 * 		- PLAssignment
		 * 		- PLConditional
		 * 		- PLFunctionCall
		 * 		- PLPrint
		 */
		if (stmt instanceof PLAssignment) {
			PLAssignment<?> s = (PLAssignment<?>) stmt;
			EvalResult r = evalExpr(s.getExpression(), prog, data);
			if (r.isInt) {
				Store.setVariable(s.getId(), r.i);
			} else {
				Store.setVariable(s.getId(), r.b);
			}
		
			
			
		} else if (stmt instanceof PLConditional) {
			PLConditional s = (PLConditional) stmt;
			if (evalExpr(s.getExpression(), prog, data).b) {
				/*
				 * Update Processor Data
				 */
				data.coverPathAt(stmt.getLineNum(), true);
				
				/*
				 * Run statements inside if block
				 */
				for (PLStatement innerStmt: s.getStatements()) {
					interpretPLStatement(innerStmt, prog, data);
				}
				
			} else {
				/*
				 * Update Processor Data
				 */
				data.coverPathAt(stmt.getLineNum(), false);
				
			}
		
			
			
		} else if (stmt instanceof PLFunctionCall) {
			PLFunctionCall s = (PLFunctionCall) stmt;
			
			/*
			 * Find the function that needs to be called.
			 */
			PLFunction<?> func = prog.getFunctions().get(s.getId());
			
			/*
			 * Add parameters to the Store
			 */
			Store.push(func.getName());
			int i = 0;
			for (
					Map.Entry<String, String> paramEntry: 
					func.getParameters().entrySet()
			) {
				Store.addVariable(paramEntry.getKey(), paramEntry.getValue());
				Store.pop();
				EvalResult fr = evalExpr(s.getArguments().get(i), prog, data);
				Store.push(func.getName());
				if (paramEntry.getValue().equals("INT")) {
					Store.setVariable(paramEntry.getKey(), fr.i);
				} else {
					Store.setVariable(paramEntry.getKey(), fr.b);
				}
				i++;
			}
			Store.pop();
			
			/*
			 * Run the function!
			 */
			interpretPLFunction(func, prog, data);

		
			
		} else if (stmt instanceof PLPrint) {
			PLPrint<?> s = (PLPrint<?>) stmt;
			/*
			 * Evaluate the expression to be printed.
			 */
			PLExpression<?> expr = s.getExpression();
			EvalResult r = evalExpr(expr, prog, data);
			
			/*
			 * Print expression result
			 */
			if (r.isInt) System.out.println("Print: " + r.i);
			else System.out.println("Print: " + r.b);
			
		} else {
			System.err.println("Statement wasn't accounted for!");
			System.exit(1);
			
			
			
		}
	}

	
	
	
	
	
	private EvalResult evalExpr(
			PLExpression<?> expr, 
			PLProgram prog, 
			ProcessorData data
	) {
		EvalResult r = new EvalResult();
		
		/*
		 * Figure out which of the following expressions is being eval'd:
		 * 		- PLAddition
		 * 		- PLAnd
		 * 		- PLArithmeticBrackets
		 * 		- PLBooleanBrackets
		 * 		- PLBooleanFunctionCall
		 * 		- PLBooleanLiteral
		 * 		- PLBooleanVariable
		 * 		- PLEqualTo
		 * 		- PLGreaterThan
		 * 		- PLGreaterThanOrEqualTo
		 * 		- PLIntegerFunctionCall
		 * 		- PLIntegerLiteral
		 * 		- PLIntegerVariable
		 * 		- PLLessThan
		 * 		- PLLessThanOrEqualTo
		 * 		- PLMultiplication
		 * 		- PLNot
		 * 		- PLNotEqualTo
		 * 		- PLOr
		 * 		- PLSubtraction
		 */
		if (expr instanceof PLAddition) {
			PLAddition e = (PLAddition) expr;
			r.isInt = true;
			r.i = evalExpr(e.getLeft(), prog, data).i 
					+ evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLAnd) {
			PLAnd e = (PLAnd) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).b 
					&& evalExpr(e.getRight(), prog, data).b;
		
			
			
		} else if (expr instanceof PLArithmeticBrackets) {
			PLArithmeticBrackets e = (PLArithmeticBrackets) expr;
			r.isInt = true;
			r.i = evalExpr(e.getExpression(), prog, data).i;
		
			
			
		} else if (expr instanceof PLBooleanBrackets) {
			PLBooleanBrackets e = (PLBooleanBrackets) expr;
			r.isInt = false;
			r.b = evalExpr(e.getExpression(), prog, data).b;
		
			
			
		} else if (expr instanceof PLBooleanFunctionCall) {
			PLBooleanFunctionCall e = (PLBooleanFunctionCall) expr;
			
			/*
			 * Find the function that needs to be called.
			 */
			PLFunction<?> func = prog.getFunctions().get(e.getId());
			
			/*
			 * Add parameters to the Store
			 */
			Store.push(func.getName());
			int i = 0;
			for (
					Map.Entry<String, String> paramEntry: 
					func.getParameters().entrySet()
			) {
				Store.addVariable(paramEntry.getKey(), paramEntry.getValue());
				Store.pop();
				EvalResult fr = evalExpr(e.getArguments().get(i), prog, data);
				Store.push(func.getName());
				if (paramEntry.getValue().equals("INT")) {
					Store.setVariable(paramEntry.getKey(), fr.i);
				} else {
					Store.setVariable(paramEntry.getKey(), fr.b);
				}
				i++;
			}
			Store.pop();
			
			/*
			 * Run the function!
			 */
			interpretPLFunction(func, prog, data);
			
			/*
			 * Return what the function returns.
			 */
			r.isInt = false;
			r.b = this.returnResult.b;
		
			
			
		} else if (expr instanceof PLBooleanLiteral) {
			PLBooleanLiteral e = (PLBooleanLiteral) expr;
			r.isInt = false;
			r.b = e.getBool();
		
			
			
		} else if (expr instanceof PLBooleanVariable) {
			PLBooleanVariable e = (PLBooleanVariable) expr;
			r.isInt = false;
			r.b = Store.getBoolVariable(e.getId());
		
			
			
		} else if (expr instanceof PLEqualTo) {
			PLEqualTo e = (PLEqualTo) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).i
					== evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLGreaterThan) {
			PLGreaterThan e = (PLGreaterThan) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).i
					> evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLGreaterThanOrEqualTo) {
			PLGreaterThanOrEqualTo e = (PLGreaterThanOrEqualTo) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).i
					>= evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLIntegerFunctionCall) {
			PLIntegerFunctionCall e = (PLIntegerFunctionCall) expr;
			
			/*
			 * Find the function that needs to be called.
			 */
			PLFunction<?> func = prog.getFunctions().get(e.getId());
			
			/*
			 * Add parameters to the Store
			 */
			Store.push(func.getName());
			int i = 0;
			for (
					Map.Entry<String, String> paramEntry: 
					func.getParameters().entrySet()
			) {
				Store.addVariable(paramEntry.getKey(), paramEntry.getValue());
				Store.pop();
				EvalResult fr = evalExpr(e.getArguments().get(i), prog, data);
				Store.push(func.getName());
				if (paramEntry.getValue().equals("INT")) {
					Store.setVariable(paramEntry.getKey(), fr.i);
				} else {
					Store.setVariable(paramEntry.getKey(), fr.b);
				}
				i++;
			}
			Store.pop();
			
			/*
			 * Run the function!
			 */
			interpretPLFunction(func, prog, data);
			
			/*
			 * Return what the function returns.
			 */
			r.isInt = true;
			r.i = this.returnResult.i;
		
			
			
		} else if (expr instanceof PLIntegerLiteral) {
			PLIntegerLiteral e = (PLIntegerLiteral) expr;
			r.isInt = true;
			r.i = e.getNum();
		
			
			
		} else if (expr instanceof PLIntegerVariable) {
			PLIntegerVariable e = (PLIntegerVariable) expr;
			r.isInt = true;
			r.i = Store.getIntVariable(e.getId());
		
			
			
		} else if (expr instanceof PLLessThan) {
			PLLessThan e = (PLLessThan) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).i
					< evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLLessThanOrEqualTo) {
			PLLessThanOrEqualTo e = (PLLessThanOrEqualTo) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).i
					<= evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLMultiplication) {
			PLMultiplication e = (PLMultiplication) expr;
			r.isInt = true;
			r.i = evalExpr(e.getLeft(), prog, data).i 
					* evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLNot) {
			PLNot e = (PLNot) expr;
			r.isInt = false;
			r.b = !evalExpr(e.getExpression(), prog, data).b;
		
			
			
		} else if (expr instanceof PLNotEqualTo) {
			PLNotEqualTo e = (PLNotEqualTo) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).i
					!= evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else if (expr instanceof PLOr) {
			PLOr e = (PLOr) expr;
			r.isInt = false;
			r.b = evalExpr(e.getLeft(), prog, data).b 
					|| evalExpr(e.getRight(), prog, data).b;
		
			
			
		} else if (expr instanceof PLSubtraction) {
			PLSubtraction e = (PLSubtraction) expr;
			r.isInt = true;
			r.i = evalExpr(e.getLeft(), prog, data).i 
					- evalExpr(e.getRight(), prog, data).i;
		
			
			
		} else {
			System.err.println("PLExpression wasn't accounted for!");
			System.exit(1);
			
			
			
		}
		
		return r;
	}
	
	
	
	
	private EvalResult evalExpr(
			TLExpression<?> expr, 
			PLProgram prog, 
			ProcessorData data
	) {
		EvalResult r = new EvalResult();
		System.out.println(expr);
		
		/*
		 * Figure out which of the following expressions is being eval'd:
		 * 		- TLBoolean
		 * 		- TLInteger
		 */
		if (expr instanceof TLBoolean) {
			TLBoolean e = (TLBoolean) expr;
			r.isInt = false;
			r.b = e.getValue();
			
		} else if (expr instanceof TLInteger) {
			TLInteger e = (TLInteger) expr;
			r.isInt = true;
			r.i = e.getValue();
			
		} else {
			System.err.println("TLExpression wasn't accounted for!");
			System.exit(1);
			
			
			
		}
		
		return r;
	}
}
