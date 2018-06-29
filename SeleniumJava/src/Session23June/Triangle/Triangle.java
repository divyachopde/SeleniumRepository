package Session23June.Triangle;

import Session23June.distance.CalDist;
import Session23June.distance.Point;

public class Triangle {

	Point p1;
	Point p2;
	Point p3;

	Triangle(Point p1, Point p2, Point p3) {

		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;

	}

	double calculatePerimeter() {

		double arm1 = CalDist.Distance(p1, p2);

		double arm2 = CalDist.Distance(p2, p3);

		double arm3 = CalDist.Distance(p3, p1);

		return (arm1 + arm2 + arm3);
	}

}
