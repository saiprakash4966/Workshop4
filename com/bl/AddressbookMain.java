package com.bl;

public class AddressbookMain
{
	
		public static void main(String[] args) 
		{
			System.out.println("Welcome to Address Book Program");
		}
		
		Addressbook AB = new Addressbook();
		{
		System.out.println("Enter total no of Contacts to add.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
		AB.addContact();
		}
	}

}
