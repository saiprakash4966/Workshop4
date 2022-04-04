package com.bl;

import java.util.Scanner;
/**
*  This is the main class to call all the methods.
* @author Saiprakash
*
*/

public class AddressBookMain 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Address Book Program");
	}
	
	{
		AddressBookMain AB=new AddressBookMain();
		int num;

		do {

			System.out.println("Please Enter 1 to add person details in Address Book");
			System.out.println("Please Enter 2 to Edit person details in Address Book");
			System.out.println("Please Enter 3 to delete person details in Address Book");

			System.out.println("Choose option to perform action");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

			switch (num) {
			case 1:

				AB.createContact();
				AB.display();
	
				break;
				
			case 2:
				AB.editPerson();
				AB.display();
				break;
			case 3:
				AB.deleteContact();
				AB.display();
			}
		} while (num != 0);
	}

	private void createContact() {
		// TODO Auto-generated method stub
		
	}

	private void deleteContact() {
		// TODO Auto-generated method stub
		
	}

	private void editPerson() {
		// TODO Auto-generated method stub
		
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}
}