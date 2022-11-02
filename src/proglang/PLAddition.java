package proglang;

public class PLAddition extends AbstractPLStatement {
	public AbstractPLStatement left;
	public AbstractPLStatement right;
	
	public PLAddition(AbstractPLStatement left, AbstractPLStatement right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return left.prettyPrint() + " + " + right.prettyPrint();
	}

	@Override
	public int linesInStatement() {
		return 0;
	}

}
