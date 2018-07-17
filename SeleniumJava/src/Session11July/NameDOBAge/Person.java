package Session11July.NameDOBAge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person {

	private Name name;

	private LocalDate DOB;

	Person(String fullName, String DOB) {
		this.name = new Name(fullName);
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	this.DOB=LocalDate.parse(DOB,formatter);
	
	}

	public Age calAge(int diff) {

		LocalDate end = LocalDate.now(ZoneId.systemDefault());
		
		if(diff>0) {
			
			end=end.plusYears(diff);
		}
		else{
			end =end.minusYears(-diff);
		}
		
		Period p = Period.between(this.DOB,end);
		
		return new Age(p);

	}

	public Age calAge() {

		return calAge(0);
	}
}
