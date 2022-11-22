package pipeline;

import java.util.Comparator;
import java.util.Map;

import proglang.model.PLAssignment;
import proglang.model.PLDeclaration;
import proglang.model.PLFunction;
import proglang.model.PLProgram;
import proglang.model.PLStatement;
import proglang.model.Store;
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
		DCPath path;
		
		// Run each function call.
		for (TLFunctionCall call: testfunc.getFunctionCalls()) {
			if (prog.getFunctions().containsKey(call.getName())) {
				PLFunction<?> func = prog.getFunctions().get(call.getName());
				
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
					if (stmt instanceof PLAssignment) {
						// control flow coverage
						dataMap.get(func.getName()).coverStatementAt(stmt.getLineNum());
						PLAssignment<?> a = (PLAssignment<?>) stmt;
						
						dataMap.get(func.getName()).coverPathAt(a.getLineNum());
						
						if (a.evaluate() instanceof Integer) {
							Store.setVariable(a.getId(), (Integer) a.evaluate());
						} else if (a.evaluate() instanceof Boolean) {
							Store.setVariable(a.getId(), (Boolean) a.evaluate());
						}
					}
				}
			}
		}
		
		// Sort line numbers
		for (Map.Entry<String, ProcessorData> entry: dataMap.entrySet()) {
			entry.getValue().allStatements.sort(Comparator.naturalOrder());
		}
	}
}
