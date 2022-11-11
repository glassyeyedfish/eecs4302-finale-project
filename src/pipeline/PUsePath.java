package pipeline;

public class PUsePath extends AbstractDCPath {
	public boolean result;

	public PUsePath(int lineFrom, int lineTo, String id, boolean result) {
		super(lineFrom, lineTo, id);
		this.result = result;
	}

}
