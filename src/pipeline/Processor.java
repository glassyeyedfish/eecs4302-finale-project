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
	public ProcessorData processPLFunction(PLFunction<?> prog) {
		ProcessorData data = new ProcessorData();
		DCPath nextPath;
		
		for (Map.Entry<String, PLDeclaration> entry: prog.getVariables().entrySet()) {
			nextPath = new DCPath(entry.getValue().getLineNum(), entry.getKey());
			
			for (PLStatement stmt: prog.getStatements()) {
				
				if (stmt.hasVariable(entry.getKey())) {
					if (stmt instanceof PLPrint) {
						nextPath.setLineTo(stmt.getLineNum());
						nextPath.setCUse(true);
						
						data.allDCPaths.add(nextPath.clone());
					}
				}
				
			}
		}
		
		return data;
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
