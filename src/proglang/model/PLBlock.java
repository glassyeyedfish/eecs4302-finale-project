package proglang.model;

public abstract class PLBlock {
	private int startLineNum;
	private int endLineNum;
	
	public PLBlock(int startLineNum, int endLineNum) {
		this.startLineNum = startLineNum;
		this.endLineNum = endLineNum;
	}

	public int getStartLineNum() {
		return startLineNum;
	}

	public int getEndLineNum() {
		return endLineNum;
	}
}
