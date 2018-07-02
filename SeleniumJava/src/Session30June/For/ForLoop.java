package Session30June.For;

public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		for (int i = 1; i <= 5; i++) {

			String name = "Divya";
			// System.out.println("divya");

			for (int j = 1; j <= 5; j++) {

				System.out.println("i= " + i + " j= " + j + " name is " + name);
				count++;
				System.out.println("count is" + count);
			}
		}

	}
}
