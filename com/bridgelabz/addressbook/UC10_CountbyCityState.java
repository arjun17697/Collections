package com.bridgelabz.addressbook;

import java.util.Collections;
import java.util.Scanner;

public class UC10_CountbyCityState {
	Scanner stdin= new Scanner(System.in);
	private int CountbyState() {
		System.out.println("Enter the name of the state");
		String getStatename= stdin.next();
		int count=Collections.frequency(deathnote.values(), getStatename);
		System.out.println(count);
		
	}
	private int CountbyCity() {
		System.out.println("Enter the name of the city");
		String getCityname= stdin.next();
		int count=Collections.frequency(deathnote.values(), getCityname);
		System.out.println(count);

	}

}
