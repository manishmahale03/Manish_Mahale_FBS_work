
class Date{
	int day;
	int month;
	int year;

}

public class Java2CreateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		date.day = 17;
		date.month = 5;
		date.year = 2025;
		
		System.out.println("Date: " + date.day + "/" + date.month + "/"  + date.year);

	}

}
