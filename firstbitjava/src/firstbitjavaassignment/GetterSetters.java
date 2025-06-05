// --------------------------------------- Student --------------------------------------- 
package firstbitjavaassignment;

class StudentGettersSetters{
	int rollNo;
	String name;
	double marks;
	
	
	int getRollNo() {
		return rollNo;
	}
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getMarks() {
		return marks;
	}
	void setMarks(double marks) {
		this.marks = marks;
	}
	
	void display() {
		
		System.out.println("Using setter: ");
		System.out.println("Id: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		
	}
}

// --------------------------------------- Employee --------------------------------------- 

class EmployeeGettersSetters{
	
	int id;
	String name;
	double salary;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	

	void display() {
		
		System.out.println("Using setter: ");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		
	}
	
}


// --------------------------------------- Admin --------------------------------------- 

class AdminGettersSettters{
	int id;
	String name;
	double salary;
	double allowance;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display() {
		System.out.println("Using setter: ");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Allowance: " + allowance);
		
	}
	
}


//--------------------------------------- HR --------------------------------------- 

class  HRGetteSetter{
	
	int id;
	String name;
	double salary; 
	double commission;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() {
		System.out.println("Using setter: ");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Commission: " + commission);
		
	}
	
}

//--------------------------------------- Sales Manager --------------------------------------- 

class SalesManagerGetterSetter {
	int id;
	String name; 
	double salary;
	double incentive;
	int target;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	
	
	void display() {
		System.out.println("Using setter: ");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
		
		
	}
	
}

//--------------------------------------- Date --------------------------------------- 


class DateGetterSetter {
	int date;
	int month;
	int year;
	
	int getDate() {
		return date;
	}
	void setDate(int date) {
		this.date = date;
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
	
	void display() {
		System.out.println("Using setter: ");
		System.out.println("Date: " + date);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}
	
	
}


//--------------------------------------- Time --------------------------------------- 

class TimeGetterSetter {
	int hour;
	int min;
	int sec;
	
	int getHour() {
		return hour;
	}
	void setHour(int hour) {
		this.hour = hour;
	}
	int getMin() {
		return min;
	}
	void setMin(int min) {
		this.min = min;
	}
	int getSec() {
		return sec;
	}
	void setSec(int sec) {
		this.sec = sec;
	}
	
	void display() {
		System.out.println("Using setter: ");
		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + min);
		System.out.println("Second: " + sec);
	}
	
}

//--------------------------------------- Distance --------------------------------------- 

class DistanceGetterSetter {
	double feet;
	double inch;
	
	double getFeet() {
		return feet;
	}
	void setFeet(double feet) {
		this.feet = feet;
	}
	double getInch() {
		return inch;
	}
	void setInch(double inch) {
		this.inch = inch;
	}
	
	void display() {
		
		System.out.println("Using setter: ");
		System.out.println("Feet: " + feet);
		System.out.println("Inch: " + inch);
		
	}
	
}

//--------------------------------------- Complex --------------------------------------- 


class ComplexGetterSetter {
	double real; 
	double imaginary;
	
	double getReal() {
		return real;
	}
	void setReal(double real) {
		this.real = real;
	}
	double getImaginary() {
		return imaginary;
	}
	void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	void display() {
		System.out.println("Using setter: ");
		System.out.println("Real: " + real);
		System.out.println("Imaginary: " + imaginary);
	}
	
}

//--------------------------------------- Product --------------------------------------- 


class ProductGetterSetter  {
	int id;
	String name;
	int quantity;
	double price;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getQuantity() {
		return quantity;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		System.out.println("Using setter: ");
		System.out.println("Id: " + id);
		System.out.println("name: " + name);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		
	}
}

public class GetterSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//--------------------------------------- Student --------------------------------------- 

		
		System.out.println("------------------ Student ------------------");
		StudentGettersSetters sgs1 = new StudentGettersSetters();
		
		sgs1.setRollNo(1);
		sgs1.setName("Setters");
		sgs1.setMarks(90);

		sgs1.display();
		
		System.out.println();
		StudentGettersSetters sgs2 = new StudentGettersSetters();
		
		sgs2.rollNo = 2;
		sgs2.name = "Getters";
		sgs2.marks = 85;
		
		System.out.println("Using getters: ");
		System.out.println("Roll No: " +sgs2.getRollNo() + "\nName: " + sgs2.getName() + "\nMarks: " + sgs2.getMarks());
		
		

		
//--------------------------------------- Employee --------------------------------------- 

		
		System.out.println("------------------ Employee ------------------");
		
		EmployeeGettersSetters egs1 = new EmployeeGettersSetters();
		
		egs1.setId(1);
		egs1.setName("Manish");
		egs1.setSalary(10000);
		
		egs1.display();
		System.out.println();
		EmployeeGettersSetters egs2 = new EmployeeGettersSetters();
		
		egs2.id = 2;
		egs2.name = "Sonu";
		egs2.salary = 25000;
		

		System.out.println("Using getters: ");
		System.out.println("Id: " + egs2.getId() + "\nName: " + egs2.getName()+ "\nSalary: " + egs2.getSalary());
		

//--------------------------------------- Admin --------------------------------------- 

		System.out.println("------------------ Admin ------------------");
		
		AdminGettersSettters ags1 = new AdminGettersSettters();
		
		ags1.setId(1);
		ags1.setName("Manish");
		ags1.setSalary(30000);
		ags1.setAllowance(10000);
		
		ags1.display();
		
		AdminGettersSettters ags2 = new AdminGettersSettters();
		ags2.id = 2;
		ags2.name = "Prashant";
		ags2.salary = 20000;
		ags2.allowance = 8000;
		
		System.out.println("Using getters: ");
		System.out.println("Id: " + ags2.getId() + "\nName: " + ags2.getName()+ "\nSalary: " + ags2.getSalary() +"\nAllowance: " + ags2.getAllowance());
		


//--------------------------------------- HR --------------------------------------- 
		
		System.out.println("------------------ HR ------------------");
		
		HRGetteSetter hrgs1 = new HRGetteSetter();
		
		hrgs1.setId(1);
		hrgs1.setName("Manish");
		hrgs1.setSalary(21000);
		hrgs1.setCommission(6000);
		
		hrgs1.display();
		
		HRGetteSetter hrgs2 = new HRGetteSetter();
		
		hrgs2.id = 2;
		hrgs2.name = "Prashant";
		hrgs2.salary = 20000;
		hrgs2.commission = 8000;
				
		
		System.out.println("Using getters: ");
		System.out.println("Id: " + hrgs2.getId() + "\nName: " + hrgs2.getName()+ "\nSalary: " + hrgs2.getSalary() +"\nAllowance: " + hrgs2.getCommission());
		

				

//--------------------------------------- Sales Manager --------------------------------------- 

		
		System.out.println("------------------ Sales Manager ------------------");
		
		SalesManagerGetterSetter smgs1 = new SalesManagerGetterSetter();
		
		
		smgs1.setId(1);
		smgs1.setName("Manish");
		smgs1.setSalary(21000);
		smgs1.setIncentive(6000);
		smgs1.setTarget(50);
		
		smgs1.display();
		
		System.out.println();
		
		SalesManagerGetterSetter smgs2 = new SalesManagerGetterSetter();
		
		
		smgs2.id = 2;
		smgs2.name = "Prashant";
		smgs2.salary = 20000;
		smgs2.incentive = 8000;
		smgs2.target = 100;
				
		
		System.out.println("Using getters: ");
		System.out.println("Id: " + smgs2.getId() + "\nName: " + smgs2.getName()+ "\nSalary: " + smgs2.getSalary() +"\nInsentive: " + smgs2.getIncentive() + "\nTarget: " + smgs2.getTarget());
				
//--------------------------------------- Date --------------------------------------- 
		
		System.out.println("------------------ Date ------------------");

		DateGetterSetter dgs1 = new DateGetterSetter();
		
		dgs1.setDate(17);
		dgs1.setMonth(5);
		dgs1.setYear(2025);
		
		dgs1.display();
		
		System.out.println();
		
		DateGetterSetter dgs2 = new DateGetterSetter();
		
		dgs2.date = 4;
		dgs2.month = 10;
		dgs2.year = 2003;
		
		System.out.println("Using getters: ");
		System.out.println("Date: " + dgs2.getDate() + "\nMonth: " + dgs2.getMonth() + "\nYear: " + dgs2.getYear());
		

//--------------------------------------- Time --------------------------------------- 
		
		System.out.println("------------------ Time ------------------");


		TimeGetterSetter tgs1 = new TimeGetterSetter();
		
		tgs1.setHour(5);
		tgs1.setMin(56);
		tgs1.setSec(19);
		
		tgs1.display();
		
		System.out.println();
		
		TimeGetterSetter tgs2 = new TimeGetterSetter();
		
		tgs2.hour = 2;
		tgs2.min = 10;
		tgs2.sec = 34;
		
		System.out.println("Using getters: ");
		System.out.println("Hour: " + tgs2.getHour() + "\nMinute: " + tgs2.getMin() + "\nSecond: " + tgs2.getSec());

		
//--------------------------------------- Distance ---------------------------------------
		
		System.out.println("------------------ Distance ------------------");

		
		DistanceGetterSetter digs1 = new DistanceGetterSetter();
		
		digs1.setFeet(25.5);
		digs1.setInch(15.7);
		
		digs1.display();
		
		System.out.println();
		
		
		DistanceGetterSetter digs2 = new DistanceGetterSetter();
		
		System.out.println("Using getters: ");
		System.out.println("Feet: " + digs2.getFeet() + "\nInch: " + digs2.getInch());


//--------------------------------------- Complex --------------------------------------- 
		
		System.out.println("------------------ Complex ------------------");


		ComplexGetterSetter cgs1 = new ComplexGetterSetter();
		
		cgs1.setImaginary(10);
		cgs1.setReal(25);
		cgs1.display();
		
		System.out.println();
		
		ComplexGetterSetter cgs2 = new ComplexGetterSetter();

		cgs2.imaginary = 13;
		cgs2.real = 17;
		
		System.out.println("Using getters: ");
		System.out.println("Imaginary: " + cgs2.getImaginary() + "\nReal: " + cgs2.getReal());

		
//--------------------------------------- Product --------------------------------------- 
		
		System.out.println("------------------ Product ------------------");

		
		ProductGetterSetter pgs1 = new ProductGetterSetter();
		
		pgs1.setId(1);
		pgs1.setName("Manish");
		pgs1.setPrice(2000);
		pgs1.setQuantity(2);
		
		pgs1.display();
		
		System.out.println();
		
		ProductGetterSetter pgs2 = new ProductGetterSetter();

		pgs2.id = 2;
		pgs2.name = "Prashant";
		pgs2.price = 5000;
		pgs2.quantity = 5;
		
		System.out.println("Using getters: ");
		System.out.println("Id: " + pgs2.getId() + "\nName: " +  pgs2.getName() + "\nPrice: " +  pgs2.getPrice() + "\nTarget: " + pgs2.getQuantity());
		
	}

}
