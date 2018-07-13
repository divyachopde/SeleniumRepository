package Session11July.NameDOBAge;

import java.util.Date;

public class Person {

	private Name name;

	private Date DOB;

	Person(String name, String DOB) {
		this.name = new Name(name);

	}

	public Age calAge(int dif) {

		return 0;

	}

	public Age calAge() {

		return calAge(0);
	}
}
