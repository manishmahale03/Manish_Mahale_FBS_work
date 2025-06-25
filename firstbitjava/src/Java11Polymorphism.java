

class PolymorphismEmployee {
	int id;
	String name;
	double salary;
	
	PolymorphismEmployee() {
		
		this.id = 100;
		this.name = "Not given";
		this.salary = 10000;
	}
	PolymorphismEmployee(int id, String name, double salary) {
		super();
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
		System.out.println("salary: " + salary);
	
	}
	
}

class PolymorphismAdmin extends PolymorphismEmployee{
	double allowance;

	PolymorphismAdmin() {
		super();
		this.allowance = 1000;
	}

	PolymorphismAdmin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display() {
		super.display();
		System.out.println("Allowance: " + allowance);
	}
	
	
}

class PolymorphismHR extends PolymorphismEmployee{
	double commission;

	PolymorphismHR() {
		super();
		this.commission = 10000;
	}

	PolymorphismHR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() {
		super.display();
		System.out.println("Commission: " + commission);
	}
	
	
}

class PolymorphismSalesManager extends PolymorphismEmployee{
	double incentive;
	double target;
	
	PolymorphismSalesManager() {
		super();
		this.incentive = 5000;
		this.target = 50;
		
	}
	PolymorphismSalesManager(int id, String name, double salary, double incentive, double target) {
		super(id, name, salary);
		
		this.incentive = incentive;
		this.target = target;
	}
	
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	double getTarget() {
		return target;
	}
	void setTarget(double target) {
		this.target = target;
	}
	
	void display() {
		super.display();
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
	}
	
}


public class Java11Polymorphism {

	public static void main(String[] args) {

		PolymorphismEmployee pe;
		
		pe = new PolymorphismAdmin();
		pe.display();
		
		pe = new PolymorphismHR();
		pe.display();
		
		pe = new PolymorphismSalesManager();
		pe.display();
		
		
	}
}
