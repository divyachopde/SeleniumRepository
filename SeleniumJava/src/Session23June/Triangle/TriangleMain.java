package Session23June.Triangle;

import Session23June.distance.Point;

public class TriangleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point t1 = new Point(5, 6);
		Point t2 = new Point(7, 8);
		Point t3 = new Point(5, 6);

		Triangle T = new Triangle(t1, t2, t3);

		System.out.println("Perimeter of Triangle is : " + T.calculatePerimeter());

	}

}
