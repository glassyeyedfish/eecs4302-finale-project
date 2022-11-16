package proglang.model;

import java.util.HashMap;
import java.util.Map;

public class PLProgram extends PLBlock {
	private String name;
	private Map<String, PLFunction> functions;
	
	public PLProgram(String name, int startLineNum, int endLineNum) {
		super(startLineNum, endLineNum);
		this.name = name;
		this.functions = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public Map<String, PLFunction> getFunctions() {
		return functions;
	}
	
	public void addFunction(PLFunction func) { 
		functions.put(func.getName(), func);
	}
}
