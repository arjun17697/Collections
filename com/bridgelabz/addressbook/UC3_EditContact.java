package com.bridgelabz.addressbook;

import java.util.*;

public class UC3_EditContact {

	public static ArrayList<Contact> edit(ArrayList<Contact> friends, String name) {
		Scanner stdin = new Scanner(System.in);
		String first=Contact.getFname();
		for (Contact obj : friends)
			if (first.equals(name)) {
				System.out.println("Please enter new details:");
				System.out.println("Address:");
				String address = stdin.next();
			} else {
				System.out.println("No contact with the given name found");
			}

		return friends;

	}

	public static void main(String[] args) {
		// Instantiate AddressBook object
		

		Scanner stdin = new Scanner(System.in);
		System.out.println("What is the first name of the contact you want to edit?");
		String name = stdin.next();

	}
}
