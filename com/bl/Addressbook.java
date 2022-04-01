package com.bl;

public class Addressbook {
	

		/**
		 * [1]-Method to add contacts to the address book.
		 * We are taking the input from the console and using the constructor to create object and assign the value.
		 */
		public void addContact() {

			Scanner scan = new Scanner(System.in);

			System.out.print(" Please enter the first name: ");
			String firstName = scan.next();

			System.out.print(" Please enter the last name: ");
			String lastName = scan.next();

			System.out.print(" Please enter the address: ");
			String address = scan.next();

			System.out.print(" Please enter the city: ");
			String city = scan.next();

			System.out.print(" Please enter the state: ");
			String state = scan.next();

			System.out.print(" Please enter the zip: ");
			int zip = scan.nextInt();

			System.out.print(" Please enter the mobile number: ");
			long mobileNumber = scan.nextLong();

			System.out.print(" Please enter the email: ");
			String email = scan.next();

			// Creating a new object of the contact class with the parameter values filled by user
			Person P = new Person(firstName, lastName, address, city, state, zip, mobileNumber, email);
			System.out.println(P);

		
	}

}
