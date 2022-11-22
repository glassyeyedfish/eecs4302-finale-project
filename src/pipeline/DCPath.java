package pipeline;

public class DCPath {
	private int lineFrom;
	private int lineTo;
	
	private boolean isCUse;
	private boolean pUseCondition;
	
	private String id;
	
	public DCPath(int lineFrom, String id) {
		this.lineFrom = lineFrom;
		this.lineTo = 0;
		
		this.isCUse = false;
		this.pUseCondition = false;
		
		this.id = id;
	}

	public DCPath(int lineFrom, int lineTo, boolean isCUse, boolean pUseCondition, String id) {
		super();
		this.lineFrom = lineFrom;
		this.lineTo = lineTo;
		this.isCUse = isCUse;
		this.pUseCondition = pUseCondition;
		this.id = id;
	}

	public int getLineFrom() {
		return lineFrom;
	}

	public void setLineFrom(int lineFrom) {
		this.lineFrom = lineFrom;
	}

	public int getLineTo() {
		return lineTo;
	}

	public void setLineTo(int lineTo) {
		this.lineTo = lineTo;
	}

	public boolean isCUse() {
		return isCUse;
	}

	public void setCUse(boolean isCUse) {
		this.isCUse = isCUse;
	}

	public boolean getPUseCondition() {
		return pUseCondition;
	}

	public void setpUseCondition(boolean pUseCondition) {
		this.pUseCondition = pUseCondition;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		if (this.isCUse) {
			return "(" 
					+ this.lineFrom 
					+ ", " 
					+ this.lineTo
					+ ", "
					+ this.id
					+ ")";
		} else {
			return "(" 
					+ this.lineFrom 
					+ ", (" 
					+ this.lineTo
					+ ", "
					+ this.pUseCondition
					+ "), "
					+ this.id
					+ ")";
		}
			
	}
	
	@Override
	public DCPath clone() {
		return new DCPath(lineFrom, lineTo, isCUse, pUseCondition, id);
	}
}
