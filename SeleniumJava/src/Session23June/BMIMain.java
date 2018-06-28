package Session23June;

public class BMIMain {
	
	public static void main(String[] args) {
		BMICalc b2 = new BMICalc();
		b2.h =60.2;
		b2.w =15.5;
		
		BMI bmi = b2.bmiCal();
		System.out.println(bmi.value);
		System.out.println(bmi.category());
		
		
		
		
	}
	
	
	
}
