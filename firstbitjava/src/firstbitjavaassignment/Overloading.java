package firstbitjavaassignment;

class ArithmeticOperation {
	
	
//	Addition
	void add(int a, int b) {
		System.out.println("Addition of Int + Int: " + (a + b));
	}
	void add(double a, double b) {
		System.out.println("Addition of Double + Double: " + (a + b));
	}
	void add(int a, double b) {
		System.out.println("Addition of Int + Double: " + (a + b));
	}
	void add(double a, int b) {
		System.out.println("Addition of Double + Int: " + (a + b));
	}
	
	
//	subtraction 
	void subtract(int a, int b) {
		System.out.println("Subtraction of Int - Int: " + (a - b));
	}
	void subtract(double a, double b) {
		System.out.println("Subtraction of Double - Double: " + (a - b));
	}
	void subtract(int a, double b) {
		System.out.println("Subtraction of Int - Double: " + (a - b));
	}
	void subtract(double a, int b) {
		System.out.println("Subtraction of Double - Int: " + (a - b));
	}
	
	
//	Multiplication
	void multiply(int a, int b) {
		System.out.println("Multiplication of Int * Int: " + (a * b));
	}
	void multiply(double a, double b) {
		System.out.println("Multiplication of Double * Double: " + (a * b));
	}
	void multiply(int a, double b) {
		System.out.println("Multiplication of Int * Double: " + (a * b));
	}
	void multiply(double a, int b) {
		System.out.println("Multiplication of Double * Int: " + (a * b));
	}
	
	
//	Division 
	void divide(int a, int b) {
		System.out.println("Division of Int / Int: " + (a / b));
	}
	void divide(double a, double b) {
		System.out.println("Division of Double / Double: " + (a / b));
	}
	void divide(int a, double b) {
		System.out.println("Division of Int / Double: " + (a / b));
	}
	void divide(double a, int b) {
		System.out.println("Division of Double / Int: " + (a / b));
	}
	
}



class Shape {
	
	void area(double base, double height) {
		System.out.println("Area of Triangle: " + (0.5 * base * height));
		
	}
	
	void area(int length ,int breadth) {
		System.out.println("Area of Rectangle: " + (length * breadth));
	}
	
	void area(double radius) {
		System.out.println("Area of Circle: " + (Math.PI * radius * radius));
	}
	
}



public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("------------------- Arithmetic Operation -------------------");
		
		ArithmeticOperation ao = new ArithmeticOperation();
		
//		Addition 
		System.out.println("------------------- Addition -------------------");
		ao.add(10, 10);
		ao.add(10.5, 10.6);
		ao.add(10, 10.6);
		ao.add(10.8, 10);
		System.out.println();
		

//		Subtraction 
		System.out.println("------------------- Substraction -------------------");
		ao.subtract(20, 10);
		ao.subtract(20.5, 10.6);
		ao.subtract(20, 10.6);
		ao.subtract(20.8, 10);
		System.out.println();

//		Multiplication 
		System.out.println("------------------- Multiplication -------------------");
		ao.multiply(10, 10);
		ao.multiply(10.5, 10.6);
		ao.multiply(10, 10.6);
		ao.multiply(10.8, 10);
		System.out.println();

//		Division 
		System.out.println("------------------- Division -------------------");
		ao.divide(20, 10);
		ao.divide(20.5, 10.6);
		ao.divide(20, 10.6);
		ao.divide(20.8, 10);
		System.out.println();
		System.out.println();

		System.out.println("------------------- Shape -------------------");
		
		Shape s = new Shape();
		s.area(20.5, 10.5);
		s.area(10, 20);
		s.area(10.5);
		
		
	}

}