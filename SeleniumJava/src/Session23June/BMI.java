package Session23June;

public class BMI {
	double value;

	BMI(double value) {

		this.value = value;
	}

	String category()
	
	{
		if (value >= 18.5)

		{
			
			return "Underweight";
		}

		else if (value >= 18.5 && value <= 24.9)

		{
			return "normal weight";
			
			
		}
		else if (value >= 25.0 && value <= 29.9)

		{
			return "overweight";
		}
		
		else  

		{
			return "Obese";
		}

		

	}

}
