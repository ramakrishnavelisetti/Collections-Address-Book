package com.bdlz.collectionaddressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static AddressBook addressBook = new AddressBook();
    static  Scanner sc = new Scanner(System.in);

    public static void addContactDetails() {
        System.out.println("Enter your choice");
        System.out.println(" 1 : Add new contact\n " +
                           "2 : Edit the contact\n " +
                           "3 : Delete the contact ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter First Name");
                String firstName = sc.next();
                System.out.println("Enter Last Name");
                String lastName = sc.next();
                System.out.println("Enter Address");
                String address = sc.next();
                System.out.println("Enter City");
                String city = sc.next();
                System.out.println("Enter State");
                String state = sc.next();
                System.out.println("Enter zipCode");
                int zipCode = sc.nextInt();
                System.out.println("Enter MobileNo");
                long mobileNo = sc.nextLong();
                System.out.println("Enter EmailId");
                String emailId = sc.next();
                Contact contactDetails = new Contact(firstName, lastName, address, city, state, zipCode, mobileNo, emailId);
                List<Contact> contactList = new ArrayList<>();
                contactList.add(contactDetails);
                addressBook.setContacts(contactList);
                printContact(addressBook);
                addContactDetails();
                break;
            case 2:
                System.out.println("Enter First Name to edit Contact");
                String editName = sc.next();
                System.out.println("Enter First Name");
                String editFirstName = sc.next();
                System.out.println("Enter  Last Name");
                String editLastName = sc.next();
                System.out.println("Enter Address");
                String editAddress = sc.next();
                System.out.println("Enter City");
                String editCity = sc.next();
                System.out.println("Enter State");
                String editState = sc.next();
                System.out.println("Enter  zipCode");
                int editZipCode = sc.nextInt();
                System.out.println("Enter MobileNo");
                long editMobileNo = sc.nextLong();
                System.out.println("Enter EmailId");
                String editEmailId = sc.next();
                editContact(editName,editFirstName, editLastName, editAddress, editCity, editState, editZipCode, editMobileNo, editEmailId);
                addContactDetails();
                sc.close();
                break;
            case 3:
                System.out.println("");
                System.out.println("Enter First Name to Delete Contact");
                String deleteName = sc.next();
                deleteContact(deleteName);
                System.out.println("Enter name is Invalid Please enter valid name");
                System.out.println("");
                addContactDetails();
                break;
        }
    }
    public static void editContact(String editName,String firstName, String lastName, String address, String city,
                                   String state, int zipCode, long mobileNo, String emailId) {
        List<Contact> contactDetails = addressBook.getContacts();
        for (int i = 0; i < contactDetails.size(); i++) {
            Contact person = contactDetails.get(i);
            if (person.getFirstName().equals(editName)) {
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setAddress(address);
                person.setCity(city);
                person.setState(state);
                person.setZipCode(zipCode);
                person.setMobileNo(mobileNo);
                person.setEmailId(emailId);
            } else {
                System.out.println("The Entered First Name Is Not Match");
                addContactDetails();
            }
        }
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
    }public static void deleteContact(String deleteName) {
        List<Contact> contactPerson = addressBook.getContacts();
        for (int i = 0; i < contactPerson.size(); i++) {
            Contact person = contactPerson.get(i);
            if (person.getFirstName().equals(deleteName)) {
                contactPerson.remove(i);
                addressBook.setContacts(contactPerson);
            }
        }
        System.out.println("Contact deleted Successfully");
        printContact(addressBook);
    }

    public static void main(String[] args) {
        addContactDetails();
        }
}
