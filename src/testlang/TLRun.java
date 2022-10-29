package testlang;

public class TLRun extends AbstractTLStatement {
	public String id;
	
	public TLRun(String id) {
		this.id = id;
	}

	@Override
	public String prettyPrint() {
		return "RUN " + id;
	}

}
