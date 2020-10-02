package com.bridgelabz.addressbook;

import java.util.*;

//import Contact.contact;

public class UC2_AddNewContact {
	Scanner stdin = new Scanner(System.in);
	// Instantiate AddressBook object
	

	public static void main(String[] args) {
		 ArrayList<Contact> friends = new ArrayList<Contact>();
		// Reads in all appropriate information.");
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter your friend's first name:");
		String fname = stdin.next();
		System.out.println("Enter your friend's last name:");
		String lname = stdin.next();
		System.out.println("Enter their phone number.");
		String phonenumber = stdin.next();
		System.out.println("Enter their city");
		String city = stdin.next();
		System.out.println("Enter their address");
		String address = stdin.next();
		System.out.println("Enter their state");
		String state = stdin.next();
		System.out.println("Enter their zip code");
		int zip = stdin.nextInt();
		System.out.println("Enter their email");
		String email = stdin.next();

		// Uses information to create Contact object, which is
		// a parameter to the addContact method.
		Contact record1 = new Contact(fname, lname, phonenumber, city, address, state, zip, email);
		friends.add(record1);
		

	}

}
