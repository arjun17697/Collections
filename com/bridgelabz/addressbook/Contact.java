package com.bridgelabz.addressbook;

public class Contact {
	private String fname; // Stores first name of Contact
    private String lname;  // Stores last name of Contact
    private String phonenumber; // Stores phone number of contact
    private String address;  // Stores address
    private String state; //stores state
    private String city; // stores city
    private int zip; // stores zip
    private String email;// stores email

    // Creates Contact object based on parameters.
    public Contact(String f,String l,String p, String c,String a, String s,int z, String e) {
		fname = f;
		lname= l;
		phonenumber = p;
		address = a;
		state=s;
		city=c;
		zip=z;
		email=e;
    }

    // Changes phone number of contact
    public void changeNumber(String newnum) {
		phonenumber = newnum;
    }


    

    public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public int getZip() {
		return zip;
	}

	public String getEmail() {
		return email;
	}

	// Prints all information about a contact out.
    public void printContact() {
		System.out.print("First Name: " + fname + " Last Name: " + lname + " Phone#: " + phonenumber);
		System.out.println(" Address: " + address + "Email:" + email );
    }

   
   

}