
public class Family {
	
	private BabySitter sitter;
	private String familyName;
	
	public Family(int startTime, int finishTime, String familyName) {
		sitter = new BabySitter(startTime, finishTime);
		this.familyName = familyName;
	}
	
	public String getFamilyName() {
		return this.familyName;
	}
}
