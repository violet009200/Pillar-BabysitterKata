
public class BabySitter {

	private final int BABYSITTER_STARTTIME = 0;
	private final int BABYSITTER_FINISHTIME = 11;
	
	
	private int startTime;
	private int finishTime;
	private boolean availability;
	private int totalPay;
	private String familyName;
	
	
	public BabySitter() {
		
	}
	
	public BabySitter(int startTime, int finishTime) {
		this.startTime = timeConverter(startTime);
		this.finishTime = timeConverter(finishTime);
		this.availability = validateWorkHourRange(this.startTime, this.finishTime);
	}
	
	
	public BabySitter(int startTime, int finishTime, String familyName) {
		this.startTime = timeConverter(startTime);
		this.finishTime = timeConverter(finishTime);
		this.availability = validateWorkHourRange(this.startTime, this.finishTime);
		this.familyName = familyName;
	}
	
	public int getStartTime() {
		return this.startTime;
	}
	
	public int getFinishTime() {
		return this.finishTime;
	}

	public boolean getAvailability() {
		return this.availability;
	}
	
	public int getTotalPay() {
		return this.totalPay;
	}
	
	public String getFamilyName() {
		return this.familyName;
	}
	
	//set 5PM to 0, 12AM to 7, 4AM to 11
	public int timeConverter(int time) {
		if(time >= 5 && time <=12)
			time-=5;
		else
			time+=7;
		return time;
	}
	
	public boolean validateWorkHourRange(int startTime, int finishTime) {
		startTime = timeConverter(startTime);
		finishTime = timeConverter(finishTime);
		
		if(startTime < BABYSITTER_STARTTIME || finishTime> BABYSITTER_FINISHTIME) return false;
		else if (startTime > finishTime) return false;
		else return true;

	}
	
	public int getHourRange(int startTime, int finishTime) {
		return timeConverter(finishTime)-timeConverter(startTime);
	}
	
	public int getPartialPayment(int startTime, int endTime, int payRate) {
		
		int hours = getHourRange(startTime, endTime);
		int partialPay = hours*payRate;
		this.totalPay+=partialPay;
		return partialPay;
	}
	
	public int payAmountForFamilyA() {
		getPartialPayment(5, 11, 15);
		getPartialPayment(11, 4, 20);
		return this.getTotalPay();
	}
	
	public int payAmountForFamilyB() {
		getPartialPayment(5, 10, 12);
		getPartialPayment(10, 12, 8);
		getPartialPayment(12, 4, 16);
		return this.getTotalPay();
	}

}
