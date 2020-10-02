package com.bridgelabz.addressbook;

import java.util.*;

public class UC5_MultipleContact {

	Scanner stdin = new Scanner(System.in);

	public void MultipleContact(int numfriends) {
		ArrayList<Contact> friends = new ArrayList<Contact>();
		for (int i = 0; i < numfriends; i++) {
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

			friends.add(new Contact(fname, lname, phonenumber, city, address, state, zip, email));
		}
	}

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter the no. of contacts you want to add");
		int numfriends = stdin.nextInt();

	}

}