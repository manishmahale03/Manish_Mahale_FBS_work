// set the default or parameterize values using constructor 
// constructor is a same name as a class name 
// we can create a multiple constructor but they have a different parameters every constructor 

// Parameterize constructor(including all variable in the class) and default constructor are mandatory for each entity class 

// If we want set the only one variable value then use the default constructor and which we want set the value use setter method 



// Date
class ConstructorDate{
	
	int day, month, year;
	String dow;
	
//	Default Constructor 
	ConstructorDate(){
		this.day = 1;
		this.month = 1;
		this.year = 2025;
		this.dow = "Monday";
	}
	
	
//	Parameterized Constructor
	ConstructorDate(int day, int month, int year, String dow) {
	this.day = day;
	this.month = month;
	this.year = year;
	this.dow = dow;
}



	void display() {
		System.out.println("day: " + day +"\nMonth: "+ month +"\nYear: " + year + "\ndow: "+ dow);
	}
	
}

// Employee
class ConstructorEmployee{
	int id;
	String name; 
	double salary;
	
//	Default Constructor 
	ConstructorEmployee() {
		this.id = 100;
		this.name = "not Given";
		this.salary = 5000;
	}
	
		
//	Parameterized Constructor
	ConstructorEmployee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	void display() {
		System.out.println("Id: " + id + "\nName: " + name + "\nSalary: " + salary);	
	}
}

// Time
class ConstructorTime{
	int hours; 
	int minutes;
	int sec;

//	Default Constructor
	ConstructorTime(){
		this.hours = 12;
		this.minutes = 10;
		this.sec = 15;
	}
	
//	Parameterized Constructor
ConstructorTime(int hours, int minutes, int sec) {
	
	this.hours = hours;
	this.minutes = minutes;
	this.sec = sec;
}

void display() {
	System.out.println("Hours: " + hours + "\nMinutes: " + minutes + "\nSecond: " + sec);
	
}
	
	
}

public class Java8Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("------------------ Date ------------------");
		ConstructorDate cd1 = new ConstructorDate();
		System.out.println("Default Constructor ");
		cd1.display();
		
		System.out.println();
		ConstructorDate cd2 = new ConstructorDate(18,5 ,2025, "Saturday");
		System.out.println("Parameterized Constructor");
		cd2.display();
		
		System.out.println();
		
		System.out.println("------------------ Employee ------------------");
		ConstructorEmployee ce1 = new ConstructorEmployee();
		System.out.println("Default Constructor ");
		ce1.display();
		
		System.out.println();
		System.out.println("Parameterized Constructor");
		ConstructorEmployee ce2 = new ConstructorEmployee (101, "Manish", 35000);
		ce2.display();
		System.out.println();
		
		System.out.println("------------------ Time ------------------");
		ConstructorTime ct1 = new ConstructorTime();
		System.out.println("Default Constructor ");
		ct1.display();
		
		System.out.println();
		ConstructorTime ct2 = new ConstructorTime(2, 30, 10);
		System.out.println("Parameterized Constructor");
		ct2.display();
		System.out.println();
		
		
		
	}
}
