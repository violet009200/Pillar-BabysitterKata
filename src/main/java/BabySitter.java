
public class BabySitter {

	
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
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
