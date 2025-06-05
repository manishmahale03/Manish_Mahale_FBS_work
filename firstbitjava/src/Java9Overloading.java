// Function Overloading 
// 

class CalculatorOverloading{
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(double a, double b) {
		
		System.out.println(a+b);
	}
	void add(int a, double b) {
		
		System.out.println(a+b);
	}
	
	void add(double a, int b) {
		
		System.out.println(a+b);
	}
	
	
}
public class Java9Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorOverloading co = new CalculatorOverloading();
		co.add(10, 20);
		co.add(10.5, 10.7);
		co.add(10, 15.7);
		co.add(122.6, 10);
		
		System.out.println();
		
		int i1 =10, i2=20;
		co.add(i1, i2);
		
		double d1 = 10.5, d2 = 10.7;
		co.add(d1, d2);
		
		int i3 = 10;
		double d3 = 15.7;
		co.add(i3, d3);
		
		double i4 = 12.6;
		int d4 = 10;
		co.add(i4, d4);
		
	}

}

