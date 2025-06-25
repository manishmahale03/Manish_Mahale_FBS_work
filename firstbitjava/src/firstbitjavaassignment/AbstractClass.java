package firstbitjavaassignment;

abstract class AbstractShape{
	
	abstract void area();
}

class AbstractRectangle extends AbstractShape {
	
	int length;
	int width;
	
	AbstractRectangle() {
		super();
		this.length = 0;
		this.width = 0;
	}
	
	
	
	AbstractRectangle(int length, int width) {
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
		
		
		int result = length * width;
		System.out.println("Rectangle: " + result);
	}

}

class AbstractTriangle extends AbstractShape {
	
	double base;
	double height;
	

	
	AbstractTriangle() {
		super();
		this.base = 0;
		this.height = 0;
	}

		
	AbstractTriangle(double base, double height) {
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
		
		double result = 2 * base + height;
		System.out.println("Triangle: " + result);
	}
}

class AbstractCircle extends AbstractShape {
	double radius;
	

	AbstractCircle() {
		super();
		this.radius = 0;
	}
	

	AbstractCircle(double radius) {
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
		
		double result = Math.PI * radius * radius;
		System.out.println("Circle: " + result );
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractShape at = new AbstractTriangle(10, 20);
		at.area();

		AbstractShape ar = new AbstractRectangle(20, 10);
		ar.area();

		AbstractShape ac = new AbstractCircle(20);
		ac.area();
		
	}
}
