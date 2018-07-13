package Session11July.Dice;

public class Dice {

	private int facevalue;

	Dice() {

		this.facevalue = RandomGenerator.randome();

	}

	public int roll() {

		this.facevalue = RandomGenerator.randome();

		return facevalue;

	}

	public int getFacevalue() {
		return facevalue;
	}

}
