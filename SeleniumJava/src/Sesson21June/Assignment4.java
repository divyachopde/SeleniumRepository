package Sesson21June;

public class Assignment4 {

	public static void main(String[] args) {

		int weight = 100;
		double height = 2.00;

		double bmi = weight / (height * height);

		if (bmi >= 18.5)

		{
			System.out.println("Underweight");
		}

		if (bmi >= 18.5 && bmi <=  24.9)

		{
			System.out.println("normal weight");
		}
		if (bmi >= 25.0 && bmi <= 29.9)

		{
			System.out.println("overweight");
		}
		if (bmi >= 30.0)

		{
			System.out.println("Obese");
		}

		else {
			System.out.println("error");

		}

	}

}
