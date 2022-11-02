package proglang;

public abstract class AbstractPLStatement {
	public int lineNum;
	public abstract int linesInStatement();
	public abstract String prettyPrint();
}
