package proglang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PLFunction extends PLBlock {
	private String name;
	private Map<String, PLDeclaration> variables;
	private List<PLStatement> statements;
	
	public PLFunction(String name, int startLineNum, int endLineNum) {
		super(startLineNum, endLineNum);
		this.name = name;
		this.statements = new ArrayList<>();
		this.variables = new HashMap<>();
	}
	
	public String getName() {
		return name;
	}
	
	public Map<String, PLDeclaration> getVariables() {
		return this.variables;
	}
	
	public List<PLStatement> getStatements() {
		return statements;
	}
	
	public void addDeclaration(PLDeclaration decl) {
		this.variables.put(decl.getId(), decl);
	}
	
	public void addStatement(PLStatement stmt) {
		this.statements.add(stmt);
	}
}
