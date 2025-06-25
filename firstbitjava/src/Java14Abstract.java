
//abstract is a function which has a declaration but does not have a definition 
// Abstract means (incomplete)

// Abstract do not have a object (can't create a object of abstract class)
// Abstract class must be inherited or overridden

//abstract class EmployeeAbstract{
//	
//	abstract void calculateSalary();
//	
//}

abstract class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateSalary();

    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary; 
    }
}


class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int id, String name, int hoursWorked, double ratePerHour) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}


class Intern extends Employee {
    double stipend;

    Intern(int id, String name, double stipend) {
        super(id, name);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }
}


public class Java14Abstract {

	public static void main(String[] args) {
		
			Employee emp1 = new FullTimeEmployee(101, "Alice", 50000);
	        Employee emp2 = new PartTimeEmployee(102, "Bob", 120, 200);
	        Employee emp3 = new Intern(103, "Charlie", 15000);
	        
	        emp1.displayInfo();
	        System.out.println("Salary: " + emp1.calculateSalary());

	        emp2.displayInfo();
	        System.out.println("Salary: " + emp2.calculateSalary());

	        emp3.displayInfo();
	        System.out.println("Salary: " + emp3.calculateSalary());
	}

}
