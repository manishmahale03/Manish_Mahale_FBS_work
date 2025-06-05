

class DatePrintDate{
	int day;
	int month;
	int year;

}


public class Java4PrintDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatePrintDate d1;
		d1 = new DatePrintDate();
		
		d1.day = 17;
		d1.month = 5;
		d1.year = 2025;
		
		System.out.println("Date : " + d1.day + "/" + d1.month + "/" + d1.year);
		
		DatePrintDate d2;
		d2 = new DatePrintDate();
		
		d2.day = 4;
		d2.month = 10;
		d2.year = 2003;
		
		System.out.println("Date : " + d2.day + "/" + d2.month + "/" + d2.year);
		
		
	}
	
}
