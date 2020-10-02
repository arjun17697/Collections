package com.bridgelabz.addressbook;

import java.util.*;

public class UC4_DeleteContact1 {

	public static ArrayList<Contact> delete(ArrayList<Contact> friends, String name) {
		Scanner stdin = new Scanner(System.in);
		String first = Contact.getFname();
		for (Contact obj : friends)
			if (first.equals(name)) {
				friends.remove(obj);
				System.out.println("Process Complete");

			} else {
				System.out.println("No contact with the given name found");
			}

		return friends;

	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("What is the first name of the contact you want to delete?");
		String name = stdin.next();

	}
}
