package pipeline;

import proglang.PLProgram;
import testlang.TLProgram;

public class PLProcessor {
	public PLProcessorData data;

	public PLProcessor(PLProcessorData data) {
		this.data = data;
	}
	
	/*
	 * Walk through PLProgram and generate the following data:
	 * 	
	 * 	- allDCPaths
	 */
	public void processPLProgram(PLProgram prog) {
		// TODO implement
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
