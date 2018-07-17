package Session11July.Dice;

public class DiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int sum = 0;
		do {

			int firstValue = d1.roll();
			int secvalue = d2.roll();
			System.out.println(firstValue);
			System.out.println(secvalue);
			sum = firstValue + secvalue;
			System.out.println( "sum is " + sum);

		} while (sum < 10);
		System.out.println(d1.getFacevalue());
		System.out.println(d2.getFacevalue());
		System.out.println("Sum is : " + sum);
	}

}
