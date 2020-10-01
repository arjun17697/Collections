package com.bridgelabz.addressbook;
import java.util.*;

//import Contact.contact;

public class UC2_AddNewContact {
	public static void main(String[] args) {

			Scanner stdin = new Scanner(System.in);

			// Instantiate AddressBook object
			AddressBook addbook1 = new AddressBook();
			//Reads in all appropriate information.");
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
    		addbook1.addContact(new Contact(fname,lname,phonenumber, city,address, state,zip, email));
		}


}