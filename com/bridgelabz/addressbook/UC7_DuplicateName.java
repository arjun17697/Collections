package com.bridgelabz.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class UC7_DuplicateName {
	//private static ArrayList<Contact> friends;
	static ArrayList<Contact> friends = new ArrayList<Contact>();

	public static void main(String[] args) {
		List<Contact> newList = friends.stream().distinct().collect(Collectors.toList());

// Print the ArrayList with duplicates removed 
		System.out.println("ArrayList with duplicates removed: " + newList);
	}

}
