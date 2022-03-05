public class Employee {
	
	String firstName; 
	String lastName; 
	String zipCode;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String zipCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
	}

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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", zipCode=" + zipCode + "]";
	}		
}