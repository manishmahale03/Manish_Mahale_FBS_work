
class DateToString{
	
	
	int day, month, year;


	DateToString() {
		
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	

	DateToString(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Print hash code\n" + super.toString() + "\n\nPrint Data\n" + "DateToString [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
}

class EmployeeToString{
	int id;
	String name;
	double salary;
	@Override
	public String toString() {
		return "EmployeeToString [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class Java13ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		To String
//		To String Without creating a ToString method use default ToString from Object Class it always return HashCode
		
//		Date
		System.out.println("------------------------- Date -------------------------");
		
		System.out.println("To String Without creating a ToString method use default ToString ");
		// don't create a toSting method in class use default from Object class
		DateToString dts = new DateToString();
		System.out.println(dts);
		System.out.println(dts.toString());
		
		
		System.out.println("To String Using createing ToSting Method in date class ");
		DateToString dateToString = new DateToString(19, 5, 2025);
		System.out.println(dateToString);
		System.out.println();
		

//		Employee
		System.out.println("------------------------- Employee -------------------------");

		EmployeeToString ets = new EmployeeToString();
		System.out.println(ets);
		
	}

}
