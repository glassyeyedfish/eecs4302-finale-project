package proglang;

public abstract class PLStatement {
	private int lineNum;
	
	public PLStatement(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getLineNum() {
		return lineNum;
	}
}
