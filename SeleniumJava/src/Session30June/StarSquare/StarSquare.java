package Session30June.StarSquare;

public class StarSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for (int i = 1; i <= 4; i++) {
		 * 
		 * for (int j = 1; j <= 4; j++) {
		 * 
		 * System.out.print("*"); } System.out.println();
		 * 
		 * }
		 */
		String x = "";
		for (int i = 1; i <= 16; i++) {
			
			x = x + "*";

			if (i % 4 == 0) {

				// System.out.println("*");
				x = x + "\n";
			}
		}
		System.out.print(x);
	}

}
