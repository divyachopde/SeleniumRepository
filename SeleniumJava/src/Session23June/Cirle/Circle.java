package Session23June.Cirle;

public class Circle {

	double r;

	final static double pi = 3.14;

	Circle(double r) {
		// constructor
		this.r = r;
	}

	double calArea() {

		double area = pi * this.r * this.r;

		return area;
	}

	double calPerimeter() {

		double perimeter = 2 * pi * this.r;

		return perimeter;

	}
	
	double calDia() {

		double calDia = 2 * this.r;

		return calDia;

	}
	
	static void messsage() {
		
		
		System.out.println("this is a circle class");
	}
}
