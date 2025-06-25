package firstbitjavaassignment;

class ArrayStudent{
	int rollNo;
	String name;
	double marks;
	ArrayStudent() {
	
		this.rollNo = 100;
		this.name = "Not Given";
		this.marks = 15;
	}
	ArrayStudent(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
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
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
}

class ArrayVehicle{
	int serialNo;
	String brand;
	int year;
	ArrayVehicle() {
		
		this.serialNo = 1000;
		this.brand = "Not Assign";
		this.year = 2000;
	}
	
	ArrayVehicle(int serialNo, String brand, int year) {
		
		this.serialNo = serialNo;
		this.brand = brand;
		this.year = year;
	}

	int getSerialNo() {
		return serialNo;
	}

	void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}
	
	void display() {
		System.out.println("Serial No: " + serialNo);
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
	}
	
}

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student");
		ArrayStudent[] as = new ArrayStudent[3];
		as[0] = new ArrayStudent(101, "Manish", 80);
		as[1] = new ArrayStudent(102, "Prashant", 76);
		as[2] = new ArrayStudent(103, "Sonu", 84);
		
		for (int i = 0; i < as.length; i++) {
			as[i].display();
			System.out.println();
			
		}
		System.out.println();
		
		
		System.out.println("Vehicle");
		ArrayVehicle[] av = new ArrayVehicle[3];
		av[0] = new ArrayVehicle(10001, "TATA", 2020);
		av[1] = new ArrayVehicle(10002, "BMW", 2023);
		av[2] = new ArrayVehicle(10003, "Mahindra", 2021);
		
		for (int i = 0; i < av.length; i++) {
			av[i].display();
			System.out.println();
		}
		
		
	}

}
