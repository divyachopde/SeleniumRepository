package Session11July.Dice;

public class RandomGenerator {
	
	private static int value;

	public static int randome() {
		
	      value = (int)(Math.random()*6) + 1;
		
		return value;
	}

}
