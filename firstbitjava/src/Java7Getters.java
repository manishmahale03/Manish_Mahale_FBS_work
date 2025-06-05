class Getters{
	
	int hour;
	int min;
	int sec;
	
	int getHour() {
		return hour;
	}
	int getMin() {
		return min;
	}
	int getSec() {
		return sec;
	}

}
public class Java7Getters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Getters g1 = new Getters();
		
		g1.hour = 1;
		g1.min = 30;
		g1.sec = 20;
		
		System.out.println("Date Using Getters: " + g1.getHour() + ":" + g1.getMin() + ":" + g1.getSec());
		
		
	}

}
