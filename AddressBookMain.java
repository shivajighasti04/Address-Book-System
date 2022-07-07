package com.bridgelabz.addressbook;

/**
 *  Ability to create a Contacts in Address Book with first and last names, address, city, state, zip,
 * phone number and email
 * 
 * @author Shivaji Ghasti
 *
 */
public class AddressBookMain {

	public static void main(String[] args) {
		
		System.out.println("----------------Welcome To Address Book Management System !-------------------");
		
		Contacts contacts = new Contacts();
		contacts.setfirstName("Ram");
		contacts.setlastName("Sham");
		contacts.setAddress("Kolhapur");
		contacts.setState("Maharashtra");
		contacts.setCity("Mumbai");
		contacts.setMobileNo("838322762");
		contacts.setPinCode("625127");
		contacts.setEmail("fdsahksjl");
		
		System.out.println("FirstName: " +contacts.getfirstName());
		System.out.println("LastName: " +contacts.getlastName());
		System.out.println("Address: " +contacts.getAddress());
		System.out.println("State: " +contacts.getState());
		System.out.println("City: " +contacts.getCity());
		System.out.println("Mobile: "+contacts.getMobileNo());
		System.out.println("Pincode: "+contacts.getPinCode());
		System.out.println("Email: "+contacts.getEmail());
	}
}
