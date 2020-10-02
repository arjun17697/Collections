package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UC9_SortCityState {
	Scanner stdin= new Scanner(System.in);
	private long SortState() {
		
		System.out.println("Enter the name of the state");
		String getStatename= stdin.next();
		//HashMap<String, ArrayList<Contact>> friends = new HashMap<String, ArrayList<Contact>>();
		HashMap<String, ArrayList<Contact>> result = deathnote.entrySet().stream().filter(map->getStatename.equals(map.getValue()));
		System.out.println("Following persons belong to provided states:" + result);
	}
	
	private long SortCity() {
		//HashMap<String, ArrayList<Contact>> friends = new HashMap<String, ArrayList<Contact>>();
		System.out.println("Enter the name of the city");
		String getCityname= stdin.next();
		HashMap<String, ArrayList<Contact>> result = deathnote.entrySet().stream().filter(map->getcityname.equals(map.getValue()));
		System.out.println("Following persons belong to provided city:" + result);
	}

}
