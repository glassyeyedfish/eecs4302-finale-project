package pipeline;

import java.util.HashMap;
import java.util.Map;

import proglang.*;
import testlang.*;
import testlang.model.TLProgram;

public class Processor {
	private Map<String, ProcessorData> dataMap;

	public Processor() {
		this.dataMap = new HashMap<>();
	}
	
	/*
	 * Accessor Methods
	 */
	public Map<String, ProcessorData> getDataMap() {
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
				
				// Loop through each statement to see if we've hit the end of
				// a DCPath.
				for (PLStatement statement: func.getStatements()) {
					if (statement.hasVariable(decl.getId())) {
						// Yay! We hit the end!
						// Now we can cut off this path, add it to the list,
						// and see if we need to keep checking.
						
						// TODO continue algorithm from here
					}
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
