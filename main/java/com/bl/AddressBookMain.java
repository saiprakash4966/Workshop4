package com.bl;

import java.util.Scanner;
/**
*  This is the main class to call all the methods.
* @author Saiprakash
*
*/

public class AddressBookMain 
{
	
	public static void main(String[] args) throws AddressBookException 
	{
		System.out.println("Welcome to Address Book Program");
	
	
	
		AddressBook AB=new AddressBook();
		MultipleAddressBook M=new MultipleAddressBook();
		while (true) {
			System.out.println("Enter \n 1. To add the new AddressBook\n 2. To add contact in AddressBook\n "
					+ "3. To edit the contact in AddressBook\n 4. To delete the contact in AddressBook\n 5. To delete the AddressBook\n "
					+ "6. To Print the AddressBook\n 7. To Print the contacts in AddressBook\n 8. Search Person By City. \n 9. Search Person by State \n  10.View Person by City \n 11.View Person by State \n 12.Count Peopele \n 0. To exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				M.addAddressBook();
				break;
			case 2:
				M.addContact();
				break;
			case 3:
				M.editContactInBook();
				break;
			case 4:
				M.deleteContactInBook();
				break;
			case 5:
				M.deleteAddressBook();
				break;
			case 6:
				M.printBook();
				break;
			case 7:
				M.printContactsInBook();
				break;
			case 8:
				M.searchByCity();
				break;
			case 9:
				M.searchByState();
			case 10:
				M.viewByCity();
			case 11:
				M.viewByState();
			case 12 :
				M.countByCity();
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the wrong input");
		
			}}}}