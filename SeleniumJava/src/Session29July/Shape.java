package Session29July;

import java.util.Comparator;

import Session4Aug.Student;

interface Shape {

	abstract double area();

	abstract double circumference();

	public static Comparator<Shape> areaCompartor = new Comparator<Shape>() {
		@Override
		public int compare(Shape o1, Shape o2) {
			// TODO Auto-generated method stub
			if (o1.area() > o2.area()) {
				return 1;
			} else if (o1.area() < o2.area()) {

				return -1;
			} else
				return 0;

		}

	};
	
	public static Comparator<Shape> circumCompartor = new Comparator<Shape>() {
		@Override
		public int compare(Shape o1, Shape o2) {
			// TODO Auto-generated method stub
			if (o1.circumference() > o2.circumference()) {
				return 1;
			} else if (o1.circumference() < o2.circumference()) {

				return -1;
			} else
				return 0;

		}

	};
}
