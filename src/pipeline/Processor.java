package pipeline;

import java.util.Map;

import proglang.model.*;
import testlang.model.*;

public class Processor {
	
	/*
	 * Walk through PLProgram and generate the following data:
	 * 	
	 * 	- allDCPaths
	 */
	public ProcessorData processPLFunction(PLFunction<?> func) {
		/* the data being generated by the processor */
		ProcessorData data = new ProcessorData();
		DCPath path;
		
		/* 
		 * Loop through each of the declarations and function parameters to 
		 * start each DCPath.
		 */
		for (Map.Entry<String, PLDeclaration> entry: func.getVariables().entrySet()) {
			path = new DCPath(entry.getValue().getLineNum(), entry.getKey());
			
			/*
			 * Loop thorugh each statement in the function and...
			 * 	- Add each statement as a new DCPath if it's a c-use or p-use
			 *  - Start a new DCPath when we've hit a definition.
			 */
			for (PLStatement stmt: func.getStatements()) {
				processPLStatement(entry, stmt, data, path);
			}
			
			if (func.getRtrnStmt() != null) {
				processPLStatement(entry, func.getRtrnStmt(), data, path);
			}
		}
		
		return data;
	}
	
	private void processPLStatement(
			Map.Entry<String, PLDeclaration> entry, 
			PLStatement stmt, 
			ProcessorData data,
			DCPath path
	) {
		/*
		 * Here is where we check for P-Uses
		 */
		if (stmt instanceof PLConditional) {
			
			if (((PLConditional) stmt).getExpression().hasVariable(entry.getKey())) {
				path.setLineTo(stmt.getLineNum());
				path.setCUse(false);
				
				path.setpUseCondition(true);
				data.allDCPaths.add(path.clone());
				
				path.setpUseCondition(false);
				data.allDCPaths.add(path.clone());
			}
		}

		/*
		 * Here is where we check for C-Uses
		 */
		if (stmt.hasVariable(entry.getKey())) {
			// Checking c-uses and p-uses
			if (
				   stmt instanceof PLPrint 
				|| stmt instanceof PLAssignment 
				|| stmt instanceof PLReturn<?>
			) {
				path.setLineTo(stmt.getLineNum());
				path.setCUse(true);
				
				data.allDCPaths.add(path.clone());
			} else if (stmt instanceof PLConditional) {
				
				
				/*
				 * When we hit a conditional, we have to remember the last 
				 * lineFrom from the DCPath right before we explore the if 
				 * statement, so that way we can reset it to that lineFrom when 
				 * we are finished searching the if statement.
				 */
				
				int preLineFrom = path.getLineFrom();
				for (PLStatement innerStmt: ((PLConditional) stmt).getStatements()) {
					processPLStatement(entry, innerStmt, data, path);
				}
				path.setLineFrom(preLineFrom);
			}
			
			// Have we hit a new definition?
			if (stmt instanceof PLAssignment) {
				if (((PLAssignment<?>) stmt).getId().equals(entry.getKey())) {
					path.setLineFrom(stmt.getLineNum());
				}
			}
		}
	}
	
	/*
	 * Run through each TLProgram test function and populate the following lists:
	 * 
	 *  - coveredDCPaths;
	 *  - coveredStatements;
	 */
	public void interpret(TLProgram test, PLProgram prog) {
		// TODO implement
	}
	
	/*
	 * Code Coverage generators.
	 */
	public void generateAllDefs(ProcessorData data) {
		// TODO implement
	}

	public void generateAllCUses(ProcessorData data) {
		// TODO implement
	}

	public void generateAllPUses(ProcessorData data) {
		// TODO implement
	}
}
