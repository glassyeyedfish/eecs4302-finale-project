package pipeline;

import java.util.HashMap;
import java.util.Map;

import proglang.*;
import proglang.model.*;
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
