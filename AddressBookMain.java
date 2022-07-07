package com.bridgelabz.addressbook;

/**
 * Ability to add multiple person details to Address Book
 * 
 * @author Shivaji Ghasti
 *
 */
public class AddressBookMain {

	public static void main(String[] args) {
		
		   System.out.println("------------------ Welcome to Address Book Management System !-------------------");
	        System.out.println();

	        AddressBook addressBook = new AddressBook();

	        // Calling addressBookMenu to perform various operations in address book
	        addressBook.addressBookMenu();
    }
}


