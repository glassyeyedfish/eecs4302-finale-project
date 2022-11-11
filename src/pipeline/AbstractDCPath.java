package pipeline;

public abstract class AbstractDCPath {
	int lineFrom;
	int lineTo;
	String id;
	
	public AbstractDCPath(int lineFrom, int lineTo, String id) {
		this.lineFrom = lineFrom;
		this.lineTo = lineTo;
		this.id = id;
	}
}
