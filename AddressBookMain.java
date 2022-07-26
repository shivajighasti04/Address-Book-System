package com.bridgelabz.addressbook;

import java.util.Scanner;

/**
 *Program to search Person in a City or State across the multiple AddressBook .
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


