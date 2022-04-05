package com.bl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleAddressBook 
{
		/**
		 * Creating map for storing addressbook and its values
		 */
		Map<String, AddressBook> addressBookMap = new HashMap<String, AddressBook>();
		/**
		 * Method to add Address book to map
		 */
		public void addAddressBook() {                                                  
			System.out.println("Enter Name of new Address Book: ");
			Scanner scanner = new Scanner(System.in);
			String bookName = scanner.next();
			//Check whether book is present or not
			if (addressBookMap.containsKey(bookName)) {                               
				System.out.println("Address book with this name exists, Enter new name.");
				addAddressBook();
			} else {
				
				AddressBook addressBook = new AddressBook();
				addressBookMap.put(bookName, addressBook);                              
				System.out.println("Address Book " + bookName + " successfully added!!");
			}
		}
		/**
		 * Method to add contacts to particular addressbook 
		 * here im add contacts to address book which is present
		 * @throws AddressBookException 
		 */
		
		public void addContact() throws AddressBookException {                                                     
			System.out.println("Enter the name of Address book to add the contact.");
			Scanner scanner = new Scanner(System.in);
			String newContact = scanner.nextLine();
			// to check if the addressbook is present
			AddressBook addressBook = addressBookMap.get(newContact);           
			if (addressBook == null) {
				System.out.println("No book found");

			} else {
				// if address book present then add it to Map
				addressBookMap.get(newContact).addContact();                         
			}
		}
		/**
		 * Method to edit contacts in particular address book
		 * @throws AddressBookException 
		 */
		public void editContactInBook() throws AddressBookException {
			System.out.println("Enter Name of Address Book you want to edit: ");
			Scanner scanner = new Scanner(System.in);
			String editBookName = scanner.next();
			if (addressBookMap.containsKey(editBookName)) {
				addressBookMap.get(editBookName).editPerson();                  
			} else {
				System.out.println("AddressBook doesn't exist, Please enter correct name.");
				editContactInBook();
			}
		}
		/**
		 * Method to delete address book if its already present
		 */
		public void deleteAddressBook() {
			System.out.println("Enter Name of Address Book you want to delete: ");
			Scanner scanner = new Scanner(System.in);
			String bookName = scanner.next();
			if (addressBookMap.containsKey(bookName)) {                                        
				addressBookMap.remove(bookName);                                                 
			} else {
				System.out.println("AddressBook doesn't exist, Please enter correct name.");
				deleteAddressBook();
			}
		}
		/**
		 * delete contacts in address book
		 */
		public void deleteContactInBook() {
			System.out.println("Enter Name of Address Book you want to delete : ");
			Scanner scanner = new Scanner(System.in);
			String bookName = scanner.next();
			if (addressBookMap.containsKey(bookName)) {
				addressBookMap.get(bookName).deleteContact();                                           
			} else {
				System.out.println("AddressBook doesn't exist, Please enter correct name.");
				deleteContactInBook();
			}
		}
		/**
		 * Method to print list of addressbook
		 */
		public void printBook() {
			System.out.println("These are AddressBooks in program.");
			for (String i : addressBookMap.keySet()) {                                     
				System.out.println(i);
			}
		}
		/*
		 * Method to display contacts in address book
		 */
		public void printContactsInBook() {
			for (String i : addressBookMap.keySet()) {
				System.out.println(i);
				System.out.println(addressBookMap.get(i).persons);                     
			}
			System.out.println(" ");
		}
		public void searchByCity() {
			// TODO Auto-generated method stub
			
		}
		public void searchByState() {
			// TODO Auto-generated method stub
			
		}
		public void viewByCity() {
			// TODO Auto-generated method stub
			
		}
		public void viewByState() {
			// TODO Auto-generated method stub
			
		}

	}


