package proglang;

import java.util.ArrayList;
import java.util.List;

public class PLFunction extends PLBlock {
	private String name;
	private List<PLDeclaration> declarations;
	private List<PLStatement> statements;
	
	public PLFunction(String name, int startLineNum, int endLineNum) {
		super(startLineNum, endLineNum);
		this.name = name;
		this.declarations = new ArrayList<>();
		this.statements = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public List<PLDeclaration> getDeclarations() {
		return declarations;
	}
	
	public List<PLStatement> getStatements() {
		return statements;
	}
	
	public void addDeclaration(PLDeclaration decl) {
		this.declarations.add(decl);
	}
	
	public void addStatement(PLStatement stmt) {
		this.statements.add(stmt);
	}
}
