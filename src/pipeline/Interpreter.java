package pipeline;

import java.util.Comparator;
import java.util.Map;

import proglang.model.*;
import testlang.model.TLFunctionCall;
import testlang.model.TLTestFunc;

public class Interpreter {
	
	/*
	 * Run through each TLProgram test function and populate the following lists:
	 * 
	 *  - coveredDCPaths;
	 *  - coveredStatements;
	 */
	public void interpret(
			TLTestFunc testfunc, 
			PLProgram prog, 
			Map<String, ProcessorData> dataMap
	) {
		// Run each function call.
		for (TLFunctionCall call: testfunc.getFunctionCalls()) {
			if (prog.getFunctions().containsKey(call.getName())) {
				PLFunction<?> func = prog.getFunctions().get(call.getName());
				
				dataMap.get(func.getName()).coverStatementAt(func.getStartLineNum());
				
				// Reset the store
				Store.reset();
				
				// Load all variables into the store.
				for (Map.Entry<String, PLDeclaration> entry: func.getVariables().entrySet()) {
					// control flow coverage
					dataMap.get(func.getName()).coverStatementAt(entry.getValue().getLineNum());
					
					Store.addVariable(entry.getKey(), entry.getValue().getType());
				}
				
				// Run all instructions in the function
				for (PLStatement stmt: func.getStatements()) {
					interpretStatement(func, stmt, dataMap);
				}
				
				if (func.getRtrnStmt() != null) {
					interpretStatement(func, func.getRtrnStmt(), dataMap);
				}
			}
		}
		
		// Sort line numbers
		for (Map.Entry<String, ProcessorData> entry: dataMap.entrySet()) {
			entry.getValue().allStatements.sort(Comparator.naturalOrder());
		}
	}
	
	private void interpretStatement(
			PLFunction<?> func,
			PLStatement stmt,
			Map<String, ProcessorData> dataMap
	) {
		// control flow coverage
		dataMap.get(func.getName()).coverStatementAt(stmt.getLineNum());
		
		if (stmt instanceof PLAssignment) {
			PLAssignment<?> a = (PLAssignment<?>) stmt;
			
			// data flow coverage
			dataMap.get(func.getName()).coverPathAt(a.getLineNum());
			
			if (a.evaluate() instanceof Integer) {
				Store.setVariable(a.getId(), (Integer) a.evaluate());
			} else if (a.evaluate() instanceof Boolean) {
				Store.setVariable(a.getId(), (Boolean) a.evaluate());
			}
		} else if (stmt instanceof PLPrint || stmt instanceof PLReturn<?>) {
			// TODO Actually print something, maybe?
			// data flow coverage
			dataMap.get(func.getName()).coverPathAt(stmt.getLineNum());
		} else if (stmt instanceof PLConditional) {
			PLConditional cnd = (PLConditional) stmt;
			
			if (cnd.getExpression().evaluate()) {
				// data flow coverage
				dataMap.get(func.getName()).coverPathAt(cnd.getLineNum(), true);
				
				// eval everything in the if-block
				for (PLStatement innerStmt: cnd.getStatements()) {
					interpretStatement(func, innerStmt, dataMap);
				}
			} else {
				// data flow coverage
				dataMap.get(func.getName()).coverPathAt(cnd.getLineNum(), false);
			}
		}
	}
}
