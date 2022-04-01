package com.bl;

public class Person
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long mobileNumber;
	private String emailId;
	
	/*Parameterized Constructor
	 * 
	 */
	public Person(String firstName, String lastName, String address, String city, String state, int zip,      //parameterized constructor
			long phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode= zipCode;
		this. mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	
         //getters and setters to access the private variables
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zip) {
		this.zipCode = zip;
	}

	public long getmobileNumber() {
		return mobileNumber;
	}

	public void setmobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return emailId;
	}

	public void setEmail(String email) {
		this.emailId = email;
	}

	@Override
	public String toString() {                                  //toStrings to format the display
		return " \n ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zipCode + ", mobileNumber=" + mobileNumber + ", email=" + emailId
				+ "]";
	}

}


