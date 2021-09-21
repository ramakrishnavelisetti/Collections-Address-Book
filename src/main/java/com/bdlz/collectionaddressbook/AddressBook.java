package com.bdlz.collectionaddressbook;

import java.util.List;

    public  class AddressBook {
        public List<Contact> contactDetailList;

        public List<Contact> getContacts() {
            return contactDetailList;
        }

        public void setContacts(List<Contact> contacts) {
            this.contactDetailList = contacts;
        }
    }