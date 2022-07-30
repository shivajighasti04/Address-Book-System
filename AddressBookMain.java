package com.bridgelabz.addressbook;

import java.util.Scanner;

/**
 * Program to sort the entries in the address book alphabetically by Person’s name
 * 
 * @author Shivaji Ghasti
 *
 */
public class AddressBookMain {
	public static void main(String[] args) {
        System.out.println("-----------------Welcome to address book  Program --------------------");
        System.out.println();

        // Calling directoryMenu method to perform user choice of operation
        AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
        addressBookDirectory.directoryMenu();
	 }
}


