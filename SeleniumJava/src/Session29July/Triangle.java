package Session29July;

abstract class Triangle implements Shape{
	
	double arm1;
	double arm2;
	double arm3;
	
	public abstract double area();
	
	public double circumference () {
		
		double c= arm1+arm2+arm3;
		
		return c;
		
	}
	

}
