
public class Family {
	private String familyName;
	private BabySitter sitter;
	
	
	public Family(int startTime, int finishTime, String familyName) {
		sitter = new BabySitter(startTime, finishTime);
		this.familyName = familyName;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	
}
