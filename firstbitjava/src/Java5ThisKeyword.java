// This Keyword 
// Current Invoking Object 


// what is Object?
// Object -> which has state behavior identity and responsibility 

class ThisKeyword{	
	
	int day;
	int month;
	int year;
	
	void display() {
		
		System.out.println("Date : " + this.day + "/" + this.month +"/" + this.year);
		
	}

}

public class Java5ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ThisKeyword d1;
		d1 = new ThisKeyword();
		
		d1.day = 17;
		d1.month = 5;
		d1.year = 2025;

		d1.display();
		
		ThisKeyword d2;
		d2 = new ThisKeyword();
		
		d2.day = 4;
		d2.month = 10;
		d2.year = 2003;
		
		d2.display();
		
	}

}
