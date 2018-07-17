package Session11July.NameDOBAge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name= sc.nextLine();
		System.out.println("Enter DOB");
		String DOB= sc.nextLine();
		
		Person P = new Person(name , DOB);
		System.out.println("Current age is" + P.calAge());
		System.out.println("Age after 3 years" + P.calAge(3));
		System.out.println("Age before 3 years" + P.calAge(-3));
	}

}
