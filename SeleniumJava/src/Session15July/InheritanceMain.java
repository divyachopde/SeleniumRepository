package Session15July;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Parent p = new Parent();
		p.driveCar();
		
		Child c=new Child();
		c.driveCar();
		
		Parent obj1= new Child();//object of child class with reference of parent class--Polymorphism
		obj1.driveCar();
		Parent obj2=new Child2();
		obj2.driveCar();
		
		ShrmaUncle s= new ShrmaUncle ();
		s.drivecar(p);//polymorphism
		s.drivecar(c);
		
		
		

	}

}
