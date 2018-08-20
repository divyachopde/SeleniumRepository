package Session29July;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(20);
		Circle c2 = new Circle(44);
		
		RightAngledTriangle R1=new RightAngledTriangle(12,15);
		RightAngledTriangle R2=new RightAngledTriangle(67,19);
		
		List<Shape> listShape = new ArrayList<Shape>();
		
		listShape.add(c1);
		listShape.add(c2);
		listShape.add(R1);
		listShape.add(R2);
		
		System.out.println(listShape);
		
		Collections.sort(listShape,Shape.areaCompartor);
		System.out.println(listShape);
		
	}

}
