package pipeline;

import proglang.model.*;
import testlang.model.*;

public class Processor {
	
	/*
	 * Walk through PLProgram and generate the following data:
	 * 	
	 * 	- allDCPaths
	 */
	public ProcessorData processPLFunction(PLFunction prog) {
		return null;
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
