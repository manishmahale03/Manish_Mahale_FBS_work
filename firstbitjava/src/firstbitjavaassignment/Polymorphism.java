package firstbitjavaassignment;



// Student 
class PolymorphismStudent {
	int fbid;
	String name;
	int distance;

	PolymorphismStudent() {

		this.fbid = 100;
		this.name = "Not Given";
		this.distance = 50;
	}

	PolymorphismStudent(int fbid, String name, int distance) {

		this.fbid = fbid;
		this.name = name;
		this.distance = distance;
	}

	int getFbid() {
		return fbid;
	}

	void setFbid(int fbid) {
		this.fbid = fbid;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getDistance() {
		return distance;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}

	void display() {
		System.out.println("Id: " + fbid);
		System.out.println("Name: " + name);
		System.out.println("Distance: " + distance);
	}

}

class PolymorphismPlacedStudent extends PolymorphismStudent {

	String companyName;
	String designation;

	PolymorphismPlacedStudent() {
		super();
		this.companyName = "Not Assign";
		this.designation = "ABC";
	}

	PolymorphismPlacedStudent(int fbid, String name, int distance, String companyName, String designation) {
		super(fbid, name, distance);
		this.companyName = companyName;
		this.designation = designation;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	void display() {
		super.display();
		System.out.println("Company Name: " + companyName);
		System.out.println("Designation: " + designation);
	}
}
 
 

// Employee
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
		System.out.println("Admin Polymorphism Manish");
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
		System.out.println("HR Polymorphism Manish");

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
		// TODO Auto-generated constructor stub
	}
	PolymorphismSalesManager(int id, String name, double salary, double incentive, double target) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
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
		System.out.println("Sales Manager Polymorphism Manish");
		super.display();
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
	}
	
}



//  shape
class PolymorphismShape{
	
	void area() {
		
		System.out.print("Area of ");
	}
}

class PolymorphismRectangle extends PolymorphismShape {
	
	int length;
	int width;
	
	PolymorphismRectangle() {
		super();
		this.length = 0;
		this.width = 0;
	}
	
	
	
	PolymorphismRectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	int getLength() {
		return length;
	}
	void setLength(int length) {
		this.length = length;
	}
	int getWidth() {
		return width;
	}
	void setWidth(int width) {
		this.width = width;
		
	}
	
	void area() {
		super.area();
		
		int result = length * width;
		System.out.println("Rectangle: " + result);
	}

}

class PolymorphismTriangle extends PolymorphismShape {
	
	double base;
	double height;
	

	
	PolymorphismTriangle() {
		super();
		this.base = 0;
		this.height = 0;
	}

		
	PolymorphismTriangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	void area() {
		super.area();
		double result = 0.5 * base + height;
		System.out.println("Triangle: " + result);
	}
}

class PolymorphismCircle extends PolymorphismShape {
	double radius;
	

	PolymorphismCircle() {
		super();
		this.radius = 0;
	}
	

	PolymorphismCircle(double radius) {
		super();
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void area() {
		super.area();
		double result = Math.PI * radius * radius;
		System.out.println("Circle: " + result );
	}
}

// Player
class PolymorphismPlayer {
	int id;
	String name;
	int jurseyNo;
	
	PolymorphismPlayer() {

		this.id = 100;
		this.name = "Not Given";
		this.jurseyNo = 0;
	}

	PolymorphismPlayer(int id, String name, int jurseyNo) {

		this.id = id;
		this.name = name;
		this.jurseyNo = jurseyNo;
	
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

	int getJurseyNo() {
		return jurseyNo;
	}

	void setJurseyNo(int jurseyNo) {
		this.jurseyNo = jurseyNo;
	}

	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Jursy No: " + jurseyNo);
	}
	
}

class PolymorphismCricket extends PolymorphismPlayer{
	int matchesPlayed;
	String role;
	PolymorphismCricket() {
		super();
		this.matchesPlayed = 10;
		this.role = "Boller";
	}
	
	PolymorphismCricket(int id, String no, int jurseyNo,int matchesPlayed, String role) {
		super(id, no, jurseyNo);
		this.matchesPlayed = matchesPlayed;
		this.role = role;
	}

	int getMatchesPlayed() {
		return matchesPlayed;
	}

	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	String getRole() {
		return role;
	}

	void setRole(String role) {
		this.role = role;
	}
	
	
	void display() {
		
		super.display();
		System.out.println("Matches Played: " + matchesPlayed);
		System.out.println("Role: " + role);
		
	}
	
	
}

class PolymorphismFootball extends PolymorphismPlayer{
	int matchesPlayed;
	String position;
	PolymorphismFootball() {
		super();
		this.matchesPlayed = 5;
		this.position = "Not Assign";
	}
	PolymorphismFootball(int id, String no, int jurseyNo, int matchesPlayed, String position) {
		
		super(id, no, jurseyNo);
		this.matchesPlayed = matchesPlayed;
		this.position = position;
	
	}
	int getMatchesPlayed() {
		return matchesPlayed;
	}
	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}
	
	
	void display() {
		super.display();
		System.out.println("Matches Played: " + matchesPlayed);
		System.out.println("Positon: " + position);
	}
}


class PolymorphismVehicle{
	
	String brand;
	int year;
	String coluor;
	
	PolymorphismVehicle() {
		
		this.brand = "Not given";
		this.year = 2000;
		this.coluor = "Not Given";
	}
	
	PolymorphismVehicle(String brand, int year, String collor) {
		this.brand = brand;
		this.year = year;
		this.coluor = collor;
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

	String getColuor() {
		return coluor;
	}

	void setColuor(String coluor) {
		this.coluor = coluor;
	}
	
	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
		System.out.println("Coluor: " + coluor);

	}
	
}

class PolymorphismCar extends PolymorphismVehicle{
	int seatingCapacity;
	String fuelType;
	
	PolymorphismCar() {
		super();
		this.seatingCapacity=0;
		this.fuelType = "Not Given";
		
	}
	
	PolymorphismCar(String brand, int year, String collor, int seatingCapacity, String fuelType) {
		super(brand, year, collor);
		this.seatingCapacity = seatingCapacity;
		this.fuelType = fuelType;
		
	}
	
	int getSeatingCapacity() {
		return seatingCapacity;
	}
	
	void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	String getFuelType() {
		return fuelType;
	}
	
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	void display() {
		super.display();
		System.out.println("Seating Capacity: " + seatingCapacity);
		System.out.println("Fuel Type: " + fuelType);
	}
	

}

class PolymorphismBike extends PolymorphismVehicle{
	String type; // (e.g., Cruiser, Sport)


	PolymorphismBike() {
		
		super();
		this.type = "Sport";
	}

	PolymorphismBike(String brand, int year, String collor, String type) {
		super(brand, year, collor);
		this.type = "Sport";
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	
	void display() {
		super.display();
		System.out.println("Type: " + type);
	}
	
}

class PolymorphismBus extends PolymorphismVehicle{
	int routeNumber;

	PolymorphismBus() {
		super();
		this.routeNumber = 50;
	}
	
	PolymorphismBus(int routeNumber) {
		super();
		this.routeNumber = routeNumber;
	}

	int getRouteNumber() {
		return routeNumber;
	}

	void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}
	
	void display() {
		super.display();
		System.out.println("Route Number: " + routeNumber);
	}

}

class PolymorphismTruck extends PolymorphismVehicle{
	int loadCapacity;

	PolymorphismTruck() {
		super();
		this.loadCapacity = 0;
	}
	
	PolymorphismTruck(int loadCapacity) {
		super();
		this.loadCapacity = loadCapacity;
	}

	int getLoadCapacity() {
		return loadCapacity;
	}

	void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	void display() {
		super.display();
		System.out.println("Load Capacity: " + loadCapacity);
		
	}
	
	
}


public class Polymorphism {

	public static void main(String[] args) {

		System.out.println("-------------------------------- Student Assignment --------------------------------");
	
		
		System.out.println("Day 1 Polymorphism ");
		
		PolymorphismStudent ips; 
		ips = new PolymorphismPlacedStudent();
		System.out.println("Default Contructor ");
		ips.display();
		
		System.out.println();
		System.out.println("Parameterized Constructor");
		ips.setFbid(1001);
		ips.setName("Manish");
		ips.setDistance(400);
		ips.display();
		
		
		System.out.println("Day 1 Polymorphism End");
		
		System.out.println();
		System.out.println();
		
		System.out.println("-------------------------------- Employee Assignment --------------------------------");
		
		PolymorphismEmployee pemp;
		
		System.out.println("Admin");
		pemp = new PolymorphismAdmin();
		System.out.println("Default Constructor");
		pemp.display();
		System.out.println("Parameterized Constructor");
		pemp.setId(111);
		pemp.setName("Prashant");
		System.out.println();
		
		System.out.println("HR");
		pemp = new PolymorphismHR();

		System.out.println("Default Constructor");
		pemp.display();
		System.out.println();
		
		System.out.println("Sales Manager");
		pemp = new PolymorphismSalesManager();
		System.out.println("Default Constructor");
		pemp.display();
		System.out.println();
		
		
		System.out.println("-------------------------------- Shape Assignment --------------------------------");

		
		PolymorphismShape  pshape;
		
		System.out.println("Triangle ");
		pshape = new PolymorphismTriangle(10, 20);
		pshape.area();
		
		
		System.out.println("Rectangle");
		pshape = new PolymorphismRectangle(10, 20);
		pshape.area();
		
		
		System.out.println("Circle");
		pshape = new PolymorphismCircle(15);
		pshape.area();
		System.out.println();
		
		
		System.out.println("-------------------------------- Player Assignment --------------------------------");
		
		PolymorphismPlayer pplayer;
		
		System.out.println("Cricket");
		pplayer = new PolymorphismCricket();
		pplayer.display();
		System.out.println();
		
		System.out.println("Football");
		pplayer = new PolymorphismFootball();
		pplayer.display();
		System.out.println();
		System.out.println();
		
		
		System.out.println("-------------------------------- Vehicle Assignment --------------------------------");
		
		PolymorphismVehicle pvehicle;
		
		System.out.println("Car");
		pvehicle = new PolymorphismCar();
		pvehicle.display();
		System.out.println();
		
		System.out.println("Bike");
		pvehicle = new PolymorphismBike();
		pvehicle.display();
		System.out.println();
		
		System.out.println("Bus");
		pvehicle = new PolymorphismBus();
		pvehicle.display();
		System.out.println();
		
		System.out.println("Truck");
		pvehicle = new PolymorphismTruck();
		pvehicle.display();
		System.out.println();
		
		
		
		
	}

}
