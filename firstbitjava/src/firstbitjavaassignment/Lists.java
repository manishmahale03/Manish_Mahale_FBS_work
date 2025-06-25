package firstbitjavaassignment;

import java.util.ArrayList;
import java.util.TreeSet;

class ListStudent{
	
	int rollNo;
	String name;
	int marks;
	String schoolName;
	
	ListStudent() {
		
		this.rollNo = 100;
		this.name = "Not Given";
		this.marks = 0;
		this.schoolName = "Not Assign";
	}
	
	ListStudent(int rollNo, String name, int marks, String schoolName) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.schoolName = schoolName;
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

	int getMarks() {
		return marks;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}

	String getSchoolName() {
		return schoolName;
	}

	void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	void display() {
		System.out.println("Roll NO: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("School Name: " + schoolName);
	}
	
}


public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Array List 
		ListStudent ls1 = new ListStudent(101, "Manish", 80, "NESS");
		ListStudent ls2 = new ListStudent(102, "Prashant", 85, "Neminath Jain");
		ListStudent ls3 = new ListStudent(103, "Sonu", 82, "NESS");
		
//		Array List 
		
		ArrayList al = new ArrayList();
		al.add(ls1);
		al.add(ls2);
		al.add(ls3);
		
		ls1.display();
		System.out.println();
		ls2.display();
		System.out.println();
		ls3.display();
		
		System.out.println();
		System.out.println();
		
		
//		Tree Set
		
		TreeSet ts = new TreeSet();
		
		ts.add(ls1);
		ts.add(ls2);
		ts.add(ls3);
		
		ls1.display();
		System.out.println();
		ls2.display();
		System.out.println();
		ls3.display();
		

//		Runtime Exception


//	Exception in thread "main" java.lang.ClassCastException: class firstbitjavaassignment.ListStudent cannot be cast to class java.lang.Comparable (firstbitjavaassignment.ListStudent is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//	at java.base/java.util.TreeMap.compare(TreeMap.java:1604)
//	at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:811)
//	at java.base/java.util.TreeMap.put(TreeMap.java:820)
//	at java.base/java.util.TreeMap.put(TreeMap.java:569)
//	at java.base/java.util.TreeSet.add(TreeSet.java:259)
//	at firstbitjavaassignment.Lists.main(Lists.java:102)

	}

}
