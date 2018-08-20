package Session29July;

public class Circle implements Shape {

	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}


	public double area() {

		double area = 3.14 * radius * radius;

		return area;
	}
	
	public double circumference() {
		
		return 2*3.14 *radius;
		
	}

}
