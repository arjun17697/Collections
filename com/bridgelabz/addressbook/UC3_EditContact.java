package com.bridgelabz.addressbook;
import java.util.*;
public class UC3_EditContact {
	public static void main(String[] args) {
			// Instantiate AddressBook object
			AddressBook blackbook = new AddressBook();

			Scanner stdin = new Scanner(System.in);
			System.out.println("What is the first name of the contact you want to edit?");
			String name = stdin.next();
			System.out.println("What is the new number of the contact you want to edit?");
			int newnum = stdin.nextInt();
			blackbook.changeNumber(newnum,name);
		}
	}


