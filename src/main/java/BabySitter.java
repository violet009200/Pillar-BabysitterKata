
public class BabySitter {

	private final int BABYSITTER_STARTTIME = 0;
	private final int BABYSITTER_FINISHTIME = 11;
	
	public BabySitter() {
		
	}
	
	//set 5PM to zero 12AM to 7 4AM to 11
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
		return hours*payRate;
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
