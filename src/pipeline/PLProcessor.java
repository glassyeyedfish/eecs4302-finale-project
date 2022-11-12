package pipeline;

import java.util.HashMap;
import java.util.Map;

import proglang.*;
import testlang.*;

public class PLProcessor {
	private Map<String, PLProcessorData> dataMap;

	public PLProcessor() {
		this.dataMap = new HashMap<>();
	}
	
	/*
	 * Accessor Methods
	 */
	public Map<String, PLProcessorData> getDataMap() {
		return dataMap;
	}
	
	public void clearDataMap() {
		this.dataMap.clear();
	}
	
	/*
	 * Walk through PLProgram and generate the following data:
	 * 	
	 * 	- allDCPaths
	 */
	public void processPLProgram(PLProgram prog) {
		DCPath nextPath;
		
		// Loop through each function
		for (PLFunction func: prog.getFunctions()) {
			
			// Start by looping through each function declaration.
			// These are the starting points for every DCPath.
			for (PLDeclaration decl: func.getDeclarations()) {
				// Find all definition clear paths from this declaration.
				nextPath = new DCPath(func.getStartLineNum(), decl.getId());
				
				for (PLStatement statement: func.getStatements()) {
					statement.hasVariable(decl.getId());
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
	public void interpretTLProgram(TLProgram test, PLProgram prog) {
		// TODO implement
	}
	
	/*
	 * Code Coverage generators.
	 */
	public void generateAllDefs() {
		// TODO implement
	}

	public void generateAllCUses() {
		// TODO implement
	}

	public void generateAllPUses() {
		// TODO implement
	}
}
