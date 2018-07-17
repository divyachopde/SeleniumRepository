package Session15July.Cricket;

public class BatsMan extends CktPlayer {

	String handOfBatting;
	int totalRunsScored;
	int numberOf100s;
	int numberOf50s;

	public BatsMan(String name, String team, int age, int matchesPlayed, String handOfBatting, int totalRunsScored,
			int numberOf100s, int numberOf50s) {
		super(name, team, age, matchesPlayed);// super calls the constructor of parent
		this.handOfBatting = handOfBatting;
		this.totalRunsScored = totalRunsScored;
		this.numberOf100s = numberOf100s;
		this.numberOf50s = numberOf50s;

	}

	@Override
	public String toString() {
		return "BatsMan [handOfBatting=" + handOfBatting + ", totalRunsScored=" + totalRunsScored + ", numberOf100s="
				+ numberOf100s + ", numberOf50s=" + numberOf50s + ", Name=" + Name + ", Team=" + Team + ", Age=" + Age
				+ ", matchesPlayed=" + matchesPlayed + "]";
	}

}
