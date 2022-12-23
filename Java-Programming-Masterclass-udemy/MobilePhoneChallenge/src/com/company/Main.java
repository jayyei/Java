package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MobilePhone mobilePhone = new MobilePhone("5581669223");
        mobilePhone.addNewContact(new Contact("Bob", "31415926"));
        mobilePhone.addNewContact(new Contact("Alice", "16180339"));
        mobilePhone.addNewContact(new Contact("Tom", "11235813"));
        mobilePhone.addNewContact(new Contact("Jane", "23571113"));
        mobilePhone.printContacts();

    }
}
