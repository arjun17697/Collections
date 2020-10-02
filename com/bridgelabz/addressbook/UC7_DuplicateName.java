package com.bridgelabz.addressbook;

import java.util.*;

public class UC7_DuplicateName {
	//private static ArrayList<Contact> friends;
	static ArrayList<Contact> friends = new ArrayList<Contact>();

	public static void main(String[] args) {
		ArrayList<Integer> newList = friends.stream().distinct().collect(Collectors.toList());

// Print the ArrayList with duplicates removed 
		System.out.println("ArrayList with duplicates removed: " + newList);
	}

}
