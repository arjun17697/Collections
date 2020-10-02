package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UC6_MultipleAddressbooks {
	private HashMap<String, ArrayList<Contact>> deathnote;
	private static ArrayList<Contact> friends;

	public void addMapName(String bookName) {
		deathnote.put(bookName, new ArrayList<Contact>());
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter the name of address book");
		String bookname = stdin.next();

	}
}