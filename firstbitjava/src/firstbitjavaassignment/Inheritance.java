package firstbitjavaassignment;

//student (Placed Student)
//employee[id, name, salary] (Admin[allowance], HR[commission], Sales Manager[incentive, target])
//shape[area] (rectangle[length, width], triangle[base, height], circle[radius])

//player[id, name, jursyNo] (cricket[role, matchesPlayed], football[position, matchesPlayed])

//vehicle[brand, year, color] (car[seatingCapacity, fuelType], bike[type], bus[routeNumber, seatingCapacity], truck[loadCapacity])





class InheritanceStudent {
	int fbid;
	String name;
	int distance;

	InheritanceStudent() {

		this.fbid = 100;
		this.name = "Not Given";
		this.distance = 50;
	}

	InheritanceStudent(int fbid, String name, int distance) {

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

class InheritancePlacedStudent extends InheritanceStudent {

	String companyName;
	String designation;

	InheritancePlacedStudent() {
		super();
		this.companyName = "Not Assign";
		this.designation = "ABC";
	}

	InheritancePlacedStudent(int fbid, String name, int distance, String companyName, String designation) {
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
 
 
class InheritanceEmployee {
	int id;
	String name;
	double salary;
	
	InheritanceEmployee() {
		
		this.id = 100;
		this.name = "Not given";
		this.salary = 10000;
	}
	InheritanceEmployee(int id, String name, double salary) {
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

class InheritanceAdmin extends InheritanceEmployee{
	double allowance;

	InheritanceAdmin() {
		super();
		this.allowance = 1000;
	}

	InheritanceAdmin(int id, String name, double salary, double allowance) {
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

class InheritanceHR extends InheritanceEmployee{
	double commission;

	InheritanceHR() {
		super();
		this.commission = 10000;
	}

	InheritanceHR(int id, String name, double salary, double commission) {
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

class InheritanceSalesManager extends InheritanceEmployee{
	double incentive;
	double target;
	
	InheritanceSalesManager() {
		super();
		this.incentive = 5000;
		this.target = 50;
		// TODO Auto-generated constructor stub
	}
	InheritanceSalesManager(int id, String name, double salary, double incentive, double target) {
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
		super.display();
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
	}
	
}

  
  
class InheritShape{
	
	void area() {
		
		System.out.print("Area of ");
	}
}

class InheritRectangle extends InheritShape {
	
	int length;
	int width;
	
	InheritRectangle() {
		super();
		this.length = 0;
		this.width = 0;
	}
	
	
	
	InheritRectangle(int length, int width) {
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
	
	void display() {
		super.area();
		
		int result = length * width;
		System.out.println("Rectangle: " + result);
	}

}

class InheritTriangle extends InheritShape {
	
	double base;
	double height;
	

	
	InheritTriangle() {
		super();
		this.base = 0;
		this.height = 0;
	}

		
	InheritTriangle(double base, double height) {
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

	void display() {
		super.area();
		double result = 2 * base + height;
		System.out.println("Triangle: " + result);
	}
}

class InheritCircle extends InheritShape {
	double radius;
	

	InheritCircle() {
		super();
		this.radius = 0;
	}
	

	InheritCircle(double radius) {
		super();
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void display() {
		super.area();
		double result = Math.PI * radius * radius;
		System.out.println("Circle: " + result );
	}
}


class InheritPlayer {
	int id;
	String name;
	int jurseyNo;
	
	InheritPlayer() {

		this.id = 100;
		this.name = "Not Given";
		this.jurseyNo = 0;
	}

	InheritPlayer(int id, String name, int jurseyNo) {

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

class InheritCricket extends InheritPlayer{
	int matchesPlayed;
	String role;
	InheritCricket() {
		super();
		this.matchesPlayed = 10;
		this.role = "Boller";
	}
	
	InheritCricket(int id, String no, int jurseyNo,int matchesPlayed, String role) {
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

class InheritFootball extends InheritPlayer{
	int matchesPlayed;
	String position;
	InheritFootball() {
		super();
		this.matchesPlayed = 5;
		this.position = "Not Assign";
	}
	InheritFootball(int id, String no, int jurseyNo, int matchesPlayed, String position) {
		
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


class InheritVehicle{
	
	String brand;
	int year;
	String coluor;
	
	InheritVehicle() {
		
		this.brand = "Not given";
		this.year = 2000;
		this.coluor = "Not Given";
	}
	
	InheritVehicle(String brand, int year, String collor) {
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

class InheritCar extends InheritVehicle{
	int seatingCapacity;
	String fuelType;
	
	InheritCar() {
		super();
		this.seatingCapacity=0;
		this.fuelType = "Not Given";
		
	}
	
	InheritCar(String brand, int year, String collor, int seatingCapacity, String fuelType) {
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

class InheritBike extends InheritVehicle{
	String type; // (e.g., Cruiser, Sport)


	InheritBike() {
		
		super();
		this.type = "Sport";
	}

	InheritBike(String brand, int year, String collor, String type) {
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

class InheritBus extends InheritVehicle{
	int routeNumber;

	InheritBus() {
		super();
		this.routeNumber = 50;
	}
	
	InheritBus(int routeNumber) {
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

class InheritTruck extends InheritVehicle{
	int loadCapacity;

	InheritTruck() {
		super();
		this.loadCapacity = 0;
	}
	
	InheritTruck(int loadCapacity) {
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



public class Inheritance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		System.out.println("-------------------------------- Student Assignment --------------------------------");
		
		System.out.println("Day 1 Inheritance ");
		
		InheritancePlacedStudent ips = new InheritancePlacedStudent();
		
		System.out.println("Default Contructor ");
		ips.display();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Parameterized Constructor");
		ips.setFbid(101);
		ips.setName("Manish");
		ips.setDistance(300);
		ips.setDesignation("Mahale");
		ips.setDesignation("PQR");
		
		ips.display();
		
		System.out.println("Day 1 Inheritance End");
		


		System.out.println("=====================================================================================================");
		
		
		System.out.println("-------------------------------- Employee Assignment --------------------------------");
		
//		Admin
		InheritanceAdmin ia = new InheritanceAdmin();
		System.out.println("Admin");
		System.out.println("Default Constructor");
		ia.display();
		System.out.println();
		System.out.println("Parameterized Constructor");
		ia.setId(101);
		ia.setName("Manish");
		ia.setSalary(25000);
		ia.setAllowance(2000);
		ia.display();
		System.out.println();
		System.out.println();
		
//		HR
		InheritanceHR ihr = new InheritanceHR();
		System.out.println("Hr");
		System.out.println("Default Constructor");
		ihr.display();
		System.out.println();
		System.out.println("Parameterized Constructor");
		ihr.setId(102);
		ihr.setName("Prashnat");
		ihr.setSalary(30000);
		ihr.setCommission(5000);
		ihr.display();
		System.out.println();
		System.out.println();
		
//		Sales Manager
		InheritanceSalesManager ism = new InheritanceSalesManager();
		System.out.println("Sales Manager");
		System.out.println("Default Constructor");
		ism.display();
		System.out.println();
		System.out.println("Parameterized Constructor");
		ism.setId(103);
		ism.setName("Sonu");
		ism.setSalary(20000);
		ism.setIncentive(5000);
		ism.setTarget(500);
		ism.display();
		System.out.println();
		System.out.println();
		

		

		System.out.println("=====================================================================================================");
		
		
		System.out.println("-------------------------------- Shape Assignment --------------------------------");

		System.out.println("Inherit Rectangle");
		InheritRectangle ir = new InheritRectangle();
		ir.setLength(10);
		ir.setWidth(20);
		ir.display();
		System.out.println();
		
		System.out.println("Inherit Triangle");		
		InheritTriangle it = new InheritTriangle();
		it.setBase(10);
		it.setHeight(20);
		it.display();
		System.out.println();
		
		System.out.println("Inherit Circle");
		InheritCircle ic = new InheritCircle();
		ic.setRadius(10);
		ic.display();
		System.out.println();


		System.out.println("=====================================================================================================");
		
		
		System.out.println("-------------------------------- Player Assignment --------------------------------");
		
		System.out.println("Inherit Cricket");
		InheritCricket icir = new InheritCricket();
		System.out.println("Default Constructor");
		icir.display();
		System.out.println();
		
		System.out.println("Parameterize Constructor");
		icir.setId(1001);
		icir.setName("Manish");
		icir.setJurseyNo(7);
		icir.setMatchesPlayed(20);
		icir.setRole("Batsman");
		
		icir.display();
		System.out.println();
		
		
		System.out.println("Inherit Football");
		InheritFootball ifoot = new InheritFootball();
		System.out.println("Default Constructor");
		ifoot.display();
		System.out.println();
		
		System.out.println("Parameterized Constructor");
		ifoot.id = 102;
		ifoot.name = "Prashant";
		ifoot.jurseyNo= 18;
		ifoot.matchesPlayed = 20;
		ifoot.position = "Forward";
		
		ifoot.display();
		System.out.println();
		
		System.out.println("=====================================================================================================");
		
		System.out.println("-------------------------------- Vehicle Assignment --------------------------------");
		
		
		System.out.println("Inherit Car");
		InheritCar icar = new InheritCar();
		System.out.println("Default Constructor");
		icar.display();
		System.out.println();
		
		System.out.println("Parameterized Constructor");
		icar.setBrand("Tata");
		icar.setYear(2020);
		icar.setColuor("Blue");
		icar.setFuelType("Petrol");
		icar.setSeatingCapacity(5);
		icar.display();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Inherit Bike");
		InheritBike ibike = new InheritBike();
		System.out.println("Default Constructor");
		ibike.display();
		System.out.println();
		
		System.out.println("Parameterized Constructor");
		ibike.setBrand("Tata");
		ibike.setYear(2020);
		ibike.setColuor("Blue");
		ibike.setType("Sport");
		ibike.display();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Inherit Bus");
		InheritBus ibus = new InheritBus();
		System.out.println("Default Constructor");
		ibus.display();
		System.out.println();
		
		System.out.println("Parameterized Constructor");
		ibus.setBrand("Tata");
		ibus.setYear(2020);
		ibus.setColuor("Blue");
		ibus.setRouteNumber(111);
		ibus.display();
		System.out.println();
		System.out.println();		
		
		
		
		System.out.println("Inherit Truck");
		InheritTruck itruck = new InheritTruck();
		System.out.println("Default Constructor");
		itruck.display();
		System.out.println();
		
		
		System.out.println("Parameterized Constructor");
		itruck.setBrand("Tata");
		itruck.setYear(2020);
		itruck.setColuor("Blue");
		itruck.setLoadCapacity(5);
		itruck.display();
		
		
		
	}

}
