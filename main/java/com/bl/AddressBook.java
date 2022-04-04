package com.bl;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Class to create implementation methods for the address book.
 * [1]-Method to add contacts to the address book.s
 * @author Sai
 *
 */
public class AddressBook
{
	/**
	 * Created a array list of type ContactDetails and calling the function of
	 * createContact.
	 */
	/**
	 * 1.Creating arraylist object
	 */
	 ArrayList<Person> persons;

	/**
	 * 2.created constructor
	 */
	public AddressBook() {
		persons=new ArrayList<Person>();

	}


	/**
	 * This method is used to create contact and store the values into arraylist
	 * 
	 * @return - returns list of contacts
	 * @throws AddressBookException 
	 */
	public  void createContact() throws AddressBookException {
		
		/**
		 * for input taken using scanner object
		 */
		Validations v=new Validations();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First name : ");
		String fname = sc.next();
		v.firstNameofUser(fname);
		System.out.print("Enter the Last name : ");
		String lname = sc.next();
		v.lastNameofUser(lname);
		
		System.out.print("Enter the Address : ");
		String address = sc.next();
		System.out.print("Enter the City : ");
		String city = sc.next();

		System.out.print("Enter the state : ");
		String state = sc.next();
		
		System.out.print("Enter the Zip Code : ");
		int zip = sc.nextInt();

		System.out.print("Enter the phone number: ");
		long phone = sc.nextLong();
		String phone_number=Long.toString(phone);
		v.mobileNumberOfUser(phone_number);
		
		System.out.print("Enter the Email: ");
		String email = sc.next();
		v.emaiIdofUser(email);
		/**
		 * Data is added into the personDetail list
		 */
		persons.add(new Person(fname, lname, address, city, state, zip, phone, email));
		
	}

	/**
	 * Method to edit contact details of person with their name
	 * @throws AddressBookException 
	 */
	public void editPerson() throws AddressBookException {
		Scanner sc=new Scanner(System.in);
		Validations v=new Validations();
		Person persons=findContacts();
		System.out.println("Enter your choice to edit: " + "\n 1.Edit first name" + "\n 2.Edit last name"
				+ "\n 3.Edit address" + "\n 4.Edit city" + "\n 5.Edit state" + "\n 6.Edit zipcode"
				+ "\n 7.Edit phone number"  + "\n 8.Edit email");
		int choice = sc.nextInt();                                 //with the help of setters setting the new details
		switch (choice) {
		case 1:
			System.out.println("Enter new first name");
			String newFirstName = sc.next();
			v.firstNameofUser(newFirstName);
			persons.setFirstName(newFirstName);
			System.out.println("new first name updated");

			break;
		case 2:
			System.out.println("Enter new last name");
			String newLastName = sc.next();
			v.lastNameofUser(newLastName);
			persons.setLastName(newLastName);
			System.out.println("new last name updated");

			break;
		case 3:
			System.out.println("Enter new address");
			String newAddress = sc.next();
			persons.setAddress(newAddress);
			System.out.println("new newaddress updated");

			break;
		case 4:
			System.out.println("Enter new city");
			String newCity = sc.next();
			persons.setCity(newCity);
			System.out.println("new city updated");

			break;
		case 5:
			System.out.println("Enter new state");
			String newState = sc.next();
			persons.setState(newState);
			System.out.println("new state updated");

			break;
		case 6:
			System.out.println("Enter new zip code");
			int newZipCode = sc.nextInt();
			persons.setZipCode(newZipCode);
			System.out.println("new zip code updated");
			break;
			
		case 7:
			System.out.println("Enter new phone number");
			long newPhoneNumber = sc.nextLong();
			String phone=Long.toString(newPhoneNumber);
			v.mobileNumberOfUser(phone);
			persons.setmobileNumber(newPhoneNumber);
			System.out.println("new phone number updated");

			break;
			
		case 8:
			System.out.println("Enter new email");
			String newEmail = sc.next();
			v.emaiIdofUser(newEmail);
			persons.setEmail(newEmail);
			System.out.println("new email updated");

			break;

		default:
			System.out.println("Please enter a number between 1 to 8 only...");
			break;
		}
		System.out.println("The contact after editing is : " + persons);
		
	}
	

	public Person findContacts() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the first name of the contact to edit: ");
		String findname = sc.next();
		int duplicate = 0;                                                   //will increment the duplicate if found multiple contacts with same name
		Person temp = null;
		for (Person person : persons) {
			if (person.getFirstName().equals(findname)) {
				duplicate++;
				temp = person;
			}
		}
		if (duplicate == 1) {
			return temp;

		} else if( duplicate > 1) {
			System.out.print(" There are multiple contacts with given name.\n Please enter their email id: ");
			String email = sc.next();
			for (Person person : persons) {
				if (person.getFirstName().equals(findname) && person.getEmail().equals(email)) {
					return person;
				}
			}
		}
		else{
			System.out.println("No contact with the given first name. Please enter the correct first name");
			findContacts();
		}
		return temp;
	}
	/**
	 * Method to delete contacts with the given name
	 */
	public void deleteContact() {                                                                       //to delete contact
		Person person = findContacts();
		if (person == null) {
			System.out.println("No contact found with the given name");
			return;
		}
		persons.remove(person);                                                                        // remove method to delete the contact
		System.out.println("The contact has been deleted from the Address Book");
	}



	public  void display() {
		for (Person person : persons)

			System.out.println("Person details " + person.getFirstName() +"\t" +person.getLastName()+"\t"+person.getAddress()+"\t" 
					+person.getCity()+"\t"+person.getState()+ "\t"+person.getZipCode()+"\t"+person.getmobileNumber()+"\t"+person.getEmail());

	}}