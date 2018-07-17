package Session11July.NameDOBAge;

import java.time.Period;

public class Age {
	
	private int year;
	private int month;
	private int day;
	
	
	public Age(Period age) {
		
		this.year=age.getYears();
		this.month=age.getMonths();
		this.day=age.getDays();
	}


	@Override
	public String toString() {
		return "Age [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
