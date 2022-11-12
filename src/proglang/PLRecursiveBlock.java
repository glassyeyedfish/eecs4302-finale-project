package proglang;

public abstract class PLRecursiveBlock extends PLStatement {
	private int endLineNum;
	
	public PLRecursiveBlock(int lineNum, int endLineNum) {
		super(lineNum);
		this.endLineNum = endLineNum;
	}

	public int getEndLineNum() {
		return endLineNum;
	}
}
