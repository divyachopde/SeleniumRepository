package Session11July.NameDOBAge;

public class Name {

	private String firstname;
	private String middleName;
	private String lastName;

	Name(String fullName) {

		String[] nameParts = fullName.split(" ");

		if (nameParts.length == 3) {

			 this.firstname = nameParts[0];
			 
			 this.middleName=nameParts[1]; 
			 this.lastName=nameParts[2];

		}

		else if (nameParts.length == 2) {
			
			this.firstname=nameParts[0];
			this.lastName=nameParts[1];

		}
		
		

	}

}
