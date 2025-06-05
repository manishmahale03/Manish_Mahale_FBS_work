
class Settres{
	
	int hour;
	int min;
	int sec;
	
	void setHour(int hour) {
		this.hour = hour;
	}
	
	void setMin(int min) {
		this.min = min;
	}
	
	void setSec(int sec) {
		this.sec = sec;
	}
	
	void display() {
		System.out.println("Time using Setters: " + hour + ":" + min + ":" + sec);
	}
	
	
}

public class Java6Setters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Settres s1 = new Settres();
		s1.setHour(12);
		s1.setMin(10);
		s1.setSec(25);
		
		s1.display();
		

	}

}
