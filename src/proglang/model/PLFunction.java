package proglang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PLFunction<T> extends PLBlock {
	private String id;
	
	// Map ID to DECL
	private Map<String, PLDeclaration> declarations;
	
	// Map ID to TYPE
	private Map<String, String> parameters;
	private List<PLStatement> instructions;
	private PLReturn<T> rtrnStmt;
	
	public PLReturn<T> getRtrnStmt() {
		return rtrnStmt;
	}

	public void setRtrnStmt(PLReturn<T> rtrnStmt) {
		this.rtrnStmt = rtrnStmt;
	}

	public PLFunction(String id, int startLineNum, int endLineNum) {
		super(startLineNum, endLineNum);
		this.id = id;
		this.instructions = new ArrayList<>();
		this.declarations = new HashMap<>();
		this.parameters = new LinkedHashMap<>();
	}
	
	public String getName() {
		return id;
	}
	
	public Map<String, PLDeclaration> getVariables() {
		return this.declarations;
	}
	
	public List<PLStatement> getStatements() {
		return this.instructions;
	}
	
	public Map<String, String> getParameters() {
		return this.parameters;
	}
	
	public void addDeclaration(PLDeclaration decl) {
		this.declarations.put(decl.getId(), decl);
	}
	
	public void addParameter(String id, String type) {
		this.parameters.put(id, type);
	}
	
	public void setParameter(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	
	public void addStatement(PLStatement stmt) {
		this.instructions.add(stmt);
	}
	
	public void setReturn(PLReturn<T> rtrnStmt) {
		this.rtrnStmt = rtrnStmt;
	}
	
	public T invoke() {
		return rtrnStmt.evaluate();
	}
}
