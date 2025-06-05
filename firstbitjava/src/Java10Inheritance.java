
// Inheritance is a way of reusing already define classes/encapsulation/(state and behavior) with is a relationship 
// Redundancy -> unnecessary repetition

// In Java extends keyword is used to implement inheritance
// In Inheritance whenever we create object of sub class implicitly super class object gets created. 
// (In Inheritance whenever we create derive class object implicitly base class object get created)


class InheritanceStudent{
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

class InheritancePlacedStudent extends InheritanceStudent{
	
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

public class Java10Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	
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
		
	}

}
