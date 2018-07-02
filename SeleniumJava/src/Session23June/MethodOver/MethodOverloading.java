package Session23June.MethodOver;

public class MethodOverloading {

	double sum(double n1, double n2) {

		System.out.println("2 double");
		return n1 + n2;

	}

	double sum(double n1, double n2, double n3) {

		System.out.println("3 double");
		return n1 + n2 + n3;

	}

	int sum(int n1, int n2) {

		System.out.println("int");
		return n1 + n2;

	}

}
