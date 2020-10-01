package com.bridgelabz.addressbook;



import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(Contact c) {
		friends[numfriends] = c;
		numfriends++;
    }

   
    // Returns a non-neg integer if a Contact with name s exists corresponding
    // to which place in the array friends the Contact is stored. Returns -1
    // otherwise.
    private int haveContact(String s) {
	
		for (int i=0;i<numfriends;i++)
	    	if (friends[i].getFname().equals(s))
				return i;
		return -1;
    }

    // Deletes a contact with name s, if one is in the AddressBook.
    public void deleteContact(String s) {
	
		int place = haveContact(s);
		if (place >= 0) {
	    	friends[place] = friends[numfriends-1];
	    	numfriends--;
		}
    }
    
    // Changes phone number of contact
    public void changeNumber(int newnum,String s) {
    	int place = haveContact(s);
		phonenumber = newnum; //how to call the number for that name
    }

    public static void main(String[] args) {

	
System.out.println("");
	
    }

 
}