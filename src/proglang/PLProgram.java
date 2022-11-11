package proglang;

import java.util.List;

public class PLProgram extends PLBlock {
	private String name;
	private List<PLFunction> functions;
	
	public PLProgram(String name, List<PLFunction> functions, int startLineNum, int endLineNum) {
		super(startLineNum, endLineNum);
		this.name = name;
		this.functions = functions;
	}

	public String getName() {
		return name;
	}

	public List<PLFunction> getFunctions() {
		return functions;
	}
}
