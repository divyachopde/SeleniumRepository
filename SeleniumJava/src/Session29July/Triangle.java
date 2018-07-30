package Session29July;

abstract class Triangle implements Shape{
	
	int arm1;
	int arm2;
	int arm3;
	
	public abstract double area();
	
	public double circumference () {
		
		double c= arm1+arm2+arm3;
		
		return c;
		
	}
	

}
