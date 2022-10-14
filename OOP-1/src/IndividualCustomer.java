
public class IndividualCustomer extends Customer {
	// extends : Herhangi bir sınıfın özelliklerini ve işlevlerini miras olarak
	// alması için kullanılan deyimdir.
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
