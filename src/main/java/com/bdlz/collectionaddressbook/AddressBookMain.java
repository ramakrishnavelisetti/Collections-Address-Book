package com.bdlz.collectionaddressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static AddressBook addressBook = new AddressBook();

    public static void addContactDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("  Add new contact ");
        System.out.println("Enter the First Name");
        String firstName = sc.next();
        System.out.println("Enter the Last Name");
        String lastName = sc.next();
        System.out.println("Enter The Address");
        String address = sc.next();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the zip Code");
        int zipCode = sc.nextInt();
        System.out.println("Enter the Phone number");
        long mobileNo = sc.nextLong();
        System.out.println("Enter the Email");
        String emailId = sc.next();
        Contact contactDetails = new Contact(firstName, lastName, address, city, state, zipCode, mobileNo, emailId);
        List<Contact> contactList = new ArrayList<>();
        contactList.add(contactDetails);
        addressBook.setContacts(contactList);
        printContact(addressBook);
    }
    public static void printContact (AddressBook addressBook) {
        List<Contact> contactPerson = addressBook.getContacts();
        for (int i = 0; i < contactPerson.size(); i++) {
            Contact person = contactPerson.get(i);
            System.out.println("Personal Details:- ");
            System.out.println("Name     : " + person.getFirstName() + " " + person.getLastName() + "\n"
                    + "Address  : " + person.getAddress() + "\n"
                    + "City     : " + person.getCity() + "\n"
                    + "State    : " + person.getState() + "\n"
                    + "ZipCode  : " + person.getZipCode() + "\n"
                    + "MobileNo : " + person.getMobileNo() + "\n"
                    + "EmailId  : " + person.getEmailId());
        }
    }

    public static void main(String[] args) {
        addContactDetails();
    }
}
