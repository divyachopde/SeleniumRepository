package Sesson21June;

public class Assignment3 {
	
	
public static void main(String[] args) {
		
		int age = 23;
		
		if ( age < 16) {
			System.out.println("You can't drive");

		} 
		else if ( age >= 16 && age <=18  ) {
			System.out.println("You can drive but not vote");

		} 
		else if ( age >= 18 && age <= 24  )  {
			System.out.println("You can vote but not rent a car");

		} 
		else if ( age >= 25) {
			System.out.println("You can do pretty much anything");

		}
		
		else

		{
			System.out.println("error");

		}

		
		

	}


}




