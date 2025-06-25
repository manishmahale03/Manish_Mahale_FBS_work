
class ArrayEmployee{
	int id;
	String name;
	double salary;
	
	ArrayEmployee() {
	
		this.id = 100;
		this.name = "Not Given";
		this.salary = 20;
	}

	ArrayEmployee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	
}

public class Java12Array {

	public static void main(String[] args) {

//		Method 1
		System.out.println("Method 1");
		int[] arr = new int[5];
		arr[0] = 10;
		arr[2] = 20;
		arr[4] = 30;
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		
//		Method 2
		System.out.println("Method 2");
		int[] arr1 = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
	
//		New Method 		
		ArrayEmployee[] arrayEmployee = new ArrayEmployee[3];
		
		arrayEmployee[0] = new ArrayEmployee(101, "Manish", 30000);
		arrayEmployee[1] = new ArrayEmployee(102, "Prashant", 25000);
		arrayEmployee[2] = new ArrayEmployee(103, "Sonu", 40000);
		
		for (int i = 0; i < arrayEmployee.length; i++) {
		
			arrayEmployee[i].display();
			System.out.println();
		}
	}

}
