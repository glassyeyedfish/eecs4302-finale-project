package pipeline;

import java.util.Comparator;
import java.util.Map;

import proglang.model.*;
import proglang.model.expressions.*;
import testlang.model.*;

public class Interpreter {
	
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
		// Run each test function.
		
		for (TLTestFunc testfunc: testProg.getTestFunctions()) {
			// Run each function call.
			for (TLFunctionCall call: testfunc.getFunctionCalls()) {
				if (prog.getFunctions().containsKey(call.getName())) {
					PLFunction<?> func = prog.getFunctions().get(call.getName());
					
					// Reset the store
					Store.reset();
					
					interpretFunction(func, data, prog);
				}
			}
		}
		
		// Sort line numbers
		data.coveredStatements.sort(Comparator.naturalOrder());
		data.coveredDecisionsTrue.sort(Comparator.naturalOrder());
		data.coveredDecisionsFalse.sort(Comparator.naturalOrder());
	}
	
	private void interpretFunction(
			PLFunction<?> func,
			ProcessorData data,
			PLProgram prog
	) {
		// control flow coverage
		data.coverStatementAt(func.getStartLineNum());
		
		// update call stack at the beginning of a function
		Store.push(func.getName());
		
		// Load all declarations into the store.
		for (Map.Entry<String, PLDeclaration> entry: func.getVariables().entrySet()) {
			
			if (!func.getParameters().containsKey(entry.getKey())) {
				// control flow coverage
				data.coverStatementAt(entry.getValue().getLineNum());
				
				Store.addVariable(entry.getKey(), entry.getValue().getType());
			}
		}
		
		// Run all instructions in the function
		for (PLStatement stmt: func.getStatements()) {
			interpretStatement(func, stmt, data, prog);
		}
		
		if (func.getRtrnStmt() != null) {
			interpretStatement(func, func.getRtrnStmt(), data, prog);
		}
		
		// update call stack when function call is ended
		Store.pop();
	}
	
	
	private void interpretStatement(
			PLFunction<?> func,
			PLStatement stmt,
			ProcessorData data,
			PLProgram prog
	) {
		// control flow coverage
		data.coverStatementAt(stmt.getLineNum());
		
		if (stmt instanceof PLAssignment) {
			PLAssignment<?> a = (PLAssignment<?>) stmt;
			
			// data flow coverage
			data.coverPathAt(a.getLineNum());
			
			if (a.evaluate() instanceof Integer) {
				Store.setVariable(a.getId(), (Integer) a.evaluate());
			} else if (a.evaluate() instanceof Boolean) {
				Store.setVariable(a.getId(), (Boolean) a.evaluate());
			}
		} else if (stmt instanceof PLPrint || stmt instanceof PLReturn<?>) {
			// TODO Actually print something, maybe?
			// data flow coverage
			data.coverPathAt(stmt.getLineNum());
		} else if (stmt instanceof PLConditional) {
			PLConditional cnd = (PLConditional) stmt;
			
			if (cnd.getExpression().evaluate()) {
				// control flow coverage
				data.coverDecisionAt(stmt.getLineNum(), true);
				
				// data flow coverage
				data.coverPathAt(cnd.getLineNum(), true);
				
				// eval everything in the if-block
				for (PLStatement innerStmt: cnd.getStatements()) {
					interpretStatement(func, innerStmt, data, prog);
				}
			} else {
				// control flow coverage
				data.coverDecisionAt(stmt.getLineNum(), false);
				
				// data flow coverage
				data.coverPathAt(cnd.getLineNum(), false);
			}
		} else if (stmt instanceof PLFunctionCall) {
			// data flow coverage
			data.coverPathAt(stmt.getLineNum());
			
			// set up
			PLFunctionCall call = (PLFunctionCall) stmt;
			PLFunction<?> nextFunc = prog.getFunctions().get(((PLFunctionCall) stmt).getId());
			
			Store.push(nextFunc.getName());
			int i = 0;
			for (Map.Entry<String, String> entry: nextFunc.getParameters().entrySet()) {
				Store.addVariable(entry.getKey(), entry.getValue());
				
				PLExpression<?> a = call.getArguments().get(i);
				
				if (a.evaluate() instanceof Integer) {
					Store.setVariable(entry.getKey(), (Integer) a.evaluate());
				} else if (a.evaluate() instanceof Boolean) {
					Store.setVariable(entry.getKey(), (Boolean) a.evaluate());
				}
				
				i++;
			}
			Store.pop();
			
			interpretFunction(nextFunc, data, prog);
		}
	}
}
