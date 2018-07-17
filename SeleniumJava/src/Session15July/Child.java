package Session15July;

public class Child extends Parent {
	
	String driveCar() {
		
		//this.car="Polo";
		super.car="nano";//parents implementation can be changed in child class and parents implementaion remains same.
		System.out.println("Childs car is : " +car);
		return car;
		
	}

}
