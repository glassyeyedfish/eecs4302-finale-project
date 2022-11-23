package proglang.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import proglang.model.expressions.PLBooleanExpression;

public class PLConditional extends PLRecursiveBlock {
	
	private  PLBooleanExpression ifExpression;
	private List<PLStatement> statements;
	
	public PLConditional(PLBooleanExpression ifExpression, int lineNum, int endLineNum) {
		super(lineNum, endLineNum);
		this.ifExpression = ifExpression;
		this.statements = new ArrayList<>();
	}

	public PLBooleanExpression getExpression() {
		return this.ifExpression;
	}
	
	public List<PLStatement> getStatements() {
		return this.statements;
	}
	
	public void addStatement(PLStatement stmt) {
		this.statements.add(stmt);
	}

	@Override
	public boolean hasVariable(String key) {
		for (PLStatement stmt: this.statements) {
			if (stmt.hasVariable(key)) return true;
		}
		return false;
	}
}
