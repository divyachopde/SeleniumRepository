package Session30June;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "FirstName LastName";
		String[] array = a.split(" ");
		System.out.println(array[0]);

		String b = "DivyaChopde";
		System.out.println(b.substring(2, 6));
		System.out.println(b.substring(6));
		System.out.println(b.length());

		String b1 = " DivyaChopde  ";
		System.out.println(b1.trim());

		String b2 = "divya";
		String b3 = "DIVYA";

		if (b2.equalsIgnoreCase(b3)) {

			System.out.println("matchh");
		} else

		{
			System.out.println("not matchh");
		}

		System.out.println(b2.toUpperCase());// change to upper case

	}
}
