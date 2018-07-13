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

			sum = firstValue + secvalue;

		} while (sum < 10);
		System.out.println(d1.getFacevalue());
		System.out.println(d2.getFacevalue());
		System.out.println("Sum is : " + sum);
	}

}
