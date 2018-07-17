package Session15July.Cricket;

public class Bowler extends CktPlayer {
	
	String typeOfBowling;
	int numberOfWickets;
	int Overs;
	
	public Bowler(String name, String team, int age, int matchesPlayed, String typeOfBowling, int numberOfWickets,
			int overs) {
		super(name, team, age, matchesPlayed);
		this.typeOfBowling = typeOfBowling;
		this.numberOfWickets = numberOfWickets;
		this.Overs = overs;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Bowler [typeOfBowling=" + typeOfBowling + ", numberOfWickets=" + numberOfWickets + ", Overs=" + Overs
				+ ", Name=" + Name + ", Team=" + Team + ", Age=" + Age + ", matchesPlayed=" + matchesPlayed + "]";
	}

}
