package Session23June.Cirle;

public class CircleMain {

	public static void main(String[] args) {
		
		//Circle.pi=3.141;
		Circle.messsage();

		Circle c = new Circle(7);// object

		System.out.println(c.calArea());
		System.out.println(c.calDia());
		System.out.println(c.calPerimeter());

		// Circle c1=null;
		// System.out.println(c1);
		// c1=new Circle(7);
		// System.out.println(c1.calArea());
		Circle c2 = c;
		c2.r = 8;
		System.out.println(c.calArea());
		System.out.println(c2.calArea());

		System.out.println(Circle.pi);// circle is class
		
		
		

	}
}
