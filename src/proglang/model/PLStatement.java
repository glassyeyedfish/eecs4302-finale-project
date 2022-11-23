package proglang.model;

public abstract class PLStatement {
	private int lineNum;
	
	public PLStatement(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getLineNum() {
		return lineNum;
	}

	public abstract boolean hasVariable(String key);
}
