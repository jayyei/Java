package com.company;

public class Main {

    public static void main(String[] args) {
	    char myChar = 'D';
        // a char occupies two bytes of memory, or 16 bits and thus has a width of 16.
        // The reason it's not just a single byte is that it allows you to store unicode characters

        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
