package firstbitjavaassignment;



//Student (rollNo, name, marks)
class StudentConstructor {
	int rollNo;
	String name;
	double marks;
	

	StudentConstructor() {
		
		this.rollNo = 100;
		this.name = "Not Given";
		this.marks = 89.43;
	}
	
	StudentConstructor(int rollNo, String name, double marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("RollNo: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
		
}

//Employee (id, name, salary)
class EmployeeConstructor{
	int id;
	String name;
	double salary;
	EmployeeConstructor() {
		
		this.id = 100;
		this.name = "Not Given";
		this.salary = 10000;
	}
	
	EmployeeConstructor(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	
	
}
//Admin (id, name, salary, allowance)

class AdminConstructor{
	int id;
	String name;
	double salary;
	double allowance;
	
	AdminConstructor() {
		
		this.id = 100;
		this.name = "Not Given";
		this.salary = 2000;
		this.allowance = 100;
	}
	
	AdminConstructor(int id, String name, double salary, double allowance) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	}
	
	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name );
		System.out.println("Salary: " + salary);
		System.out.println("Allowance: " + allowance);
	}
	
	
}
//HR (id, name, salary, commission)

class HRConstructor{
	int id;
	String name;
	double salary;
	double commission;
	HRConstructor() {
		
		this.id = 100;
		this.name = "Not Given";
		this.salary = 10000;
		this.commission = 2000;
	}
	
	
	HRConstructor(int id, String name, double salary, double commission) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
	}
	

	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name );
		System.out.println("Salary: " + salary);
		System.out.println("Commission: " + commission);
	}
	
	
	
	
}
//SalesManager (id, name, salary, incentive, target)
class SalesManagerConstructor{
	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	SalesManagerConstructor() {
		
		this.id = 100;
		this.name = "Not Given";
		this.salary = 8000;
		this.incentive = 2000;
		this.target = 50;
	}
	
	SalesManagerConstructor(int id, String name, double salary, double incentive, int target) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}
	
	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name );
		System.out.println("Salary: " + salary);
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
	}
	
	
	
	
}
//Date (date, month, year)
class DateConstructor{
	int date, month, year;

	DateConstructor() {
		
		this.date = 1;
		this.month = 1;
		this.year = 2025;
	}
	
	DateConstructor(int date, int month, int year) {
		
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	void display() {
		System.out.println("Date: " + date);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}
	
	
}
//Time (hour, min, sec)
class TimeConstructor{
	int hour, min, sec;

	TimeConstructor() {
		
		this.hour = 12;
		this.min = 00;
		this.sec = 00;
	}
	
	TimeConstructor(int hour, int min, int sec) {
		
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	void display() {
		System.out.println("Hour: " + hour);
		System.out.println("Minutes: " + min);
		System.out.println("Second: " + sec);
	}
	
}
//Distance ( feet, inch)
class DistanceConstructor{
	double feet;
	double inch;
	DistanceConstructor() {
		
		this.feet = 10.5;
		this.inch = 15.4;
	}
	DistanceConstructor(double feet, double inch) {
		
		this.feet = feet;
		this.inch = inch;
	}
	void display() {
		System.out.println("Feet: " + feet);
		System.out.println("Inch: " + inch);
	}
	
}
//Complex (real, imaginary)
class ComplxConstructor{
	int real;
	int imaginary;
	
	ComplxConstructor() {
		
		this.real = 20;
		this.imaginary = 13;
	}
	
	ComplxConstructor(int real, int imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void display() {
		System.out.println("Real: " + real);
		System.out.println("Imaginary: " + imaginary);
	}
	
}
//Product (id, name, quantity, price)
class ProductConstructor{
	int id;
	String name;
	int quantity;
	double price;
	ProductConstructor() {
		
		this.id = 100;
		this.name = "Not Given";
		this.quantity = 30;
		this.price = 200;
	}
	ProductConstructor(int id, String name, int quantity, double price) {
		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name );
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		
	}
	
	
		
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student
		System.out.println("-------------------- Student --------------------");
		
		StudentConstructor sc1 = new StudentConstructor();
		System.out.println("Default Constructor ");
		sc1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		StudentConstructor sc2 = new StudentConstructor(1, "Manish", 40000);
		sc2.display();
		
		
//		Employee
		System.out.println("-------------------- Employee --------------------");
		
		System.out.println("Default Constructor ");
		EmployeeConstructor ec1 = new EmployeeConstructor();
		ec1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		EmployeeConstructor ec2 = new EmployeeConstructor(1, "Manish", 4000);
		ec2.display();
		
//		Admin
		System.out.println("-------------------- Admin --------------------");
		System.out.println("Default Constructor ");
		
		AdminConstructor ac1 = new AdminConstructor();
		ac1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		AdminConstructor ac2 = new AdminConstructor(1, "Manish", 36000, 4000);
		ac2.display();
		
		System.out.println();
		
//		HR 
		System.out.println("-------------------- HR --------------------");
		System.out.println("Default Constructor ");
		
		HRConstructor arc1 = new HRConstructor();
		arc1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		HRConstructor arc2 = new HRConstructor(1, "Manish", 40000, 10000);
		arc2.display();
		
		
//		Sales Manager 
		System.out.println("-------------------- Sales Manager --------------------");
		System.out.println("Default Constructor ");
		
		SalesManagerConstructor smc1 = new SalesManagerConstructor();
		smc1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		SalesManagerConstructor smc2 = new SalesManagerConstructor(1, "Manish", 55000, 5000, 50);
		smc2.display();
		
		
//		Date 
		System.out.println("-------------------- Date --------------------");
		System.out.println("Default Constructor ");
		DateConstructor dc1 = new DateConstructor ();
		dc1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		DateConstructor dc2 = new DateConstructor (19, 5, 2025);
		dc2.display();
		
		
		
//		Time 
		 
		System.out.println("-------------------- Time --------------------");
		System.out.println("Default Constructor ");
		TimeConstructor tc1 = new TimeConstructor();
		tc1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		TimeConstructor tc2 = new TimeConstructor(2, 30, 10);
		tc2.display();
		
//		Distance 
		System.out.println("-------------------- Distance --------------------");
		System.out.println("Default Constructor ");
		DistanceConstructor dic1 = new DistanceConstructor();
		dic1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		DistanceConstructor dic2 = new DistanceConstructor(20, 16);
		dic2.display();
		
		
//		Product
		
		System.out.println("-------------------- Product --------------------");
		System.out.println("Default Constructor ");
		ProductConstructor pc1 = new ProductConstructor();
		pc1.display();
		
		System.out.println();
		System.out.println("Parameterize Constructor ");
		ProductConstructor pc2 = new ProductConstructor(1, "Manish", 2, 100000);
		pc2.display();
		
		
		
	}

}
