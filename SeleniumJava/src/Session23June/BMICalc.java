package Session23June;

public class BMICalc {
	
	double w;
	double h;
	
	BMI bmiCal()
	
	{
		
		double bmi = w / (h * h);
		
		BMI b1 = new BMI(bmi);
		
		return b1;
		
	}
	
	

}
