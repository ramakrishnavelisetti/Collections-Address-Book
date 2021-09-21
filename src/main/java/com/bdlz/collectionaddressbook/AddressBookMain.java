package com.bdlz.collectionaddressbook;

import java.util.List;

public class AddressBookMain {
    public static class contactDetails {
        public String firstName;
        public String lastName;
        public String address;
        public String city;
        public String state;
        public int zipCode;
        public long mobileNo;
        public String emailId;

    }
    public static void printContact () {
        contactDetails person = new contactDetails();
        person.firstName = ("Ramakrishna");
        person.lastName = ("Velisetti");
        person.address = ("Sitaramapuram-A");
        person.city = ("Vijayawada");
        person.state = ("Andhra Pradesh");
        person.zipCode = (521109);
        person.mobileNo = (8500029054L);
        person.emailId = ("ramakrishna31.velisetti@gmail.com");
        System.out.println("Personal Details:- ");
        System.out.println("Name     : "  + person.firstName +" " + person.lastName + "\n"
                + "Address  : "  + person.address   + "\n"
                + "City     : "  + person.city      + "\n"
                + "State    : "  + person.state     + "\n"
                + "ZipCode  : "  + person.zipCode   + "\n"
                + "MobileNo : "  + person.mobileNo  + "\n"
                + "EmailId  : "  + person.emailId);
    }

    public static void main(String[] args) {
        printContact();
    }
}
