package proglang;

public abstract class PLStatement {
	private int lineNum;
	
	public abstract boolean hasVariable(String id);
	
	public PLStatement(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getLineNum() {
		return lineNum;
	}
}
