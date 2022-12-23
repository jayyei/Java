package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int indexContact = findContact(contact);
        if (indexContact < 0) {
            myContacts.add(contact);
        }
        return indexContact < 0;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if(index >= 0) {
            myContacts.set(index, newContact);
        }
        return index >= 0;
    }

    public boolean removeContact(Contact contact) {
        int index =  findContact(contact);
        if (index >= 0) {
            myContacts.remove(contact);
        }
        return index >= 0;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        Contact contact = queryContact(name);
        if (contact == null) {
            return -1;
        }
        return myContacts.indexOf(contact);
    }

    public Contact queryContact(String name) {
        for (Contact contact: myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int i = 1;
        for (Contact contact:
             myContacts) {
            System.out.println(i  + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            i++;
        }
    }


}
