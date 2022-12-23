package com.company;

public class Main {

    // The switch statement can only work with these primitives: byte, short, char and int
    // The object types are String, Character, Integer, Enum, Byte and Short
    public static void main(String[] args) {
	// write your code here

        char charValue = 'F';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D' : case 'E':
                System.out.println(charValue + " was found");
            default:
                System.out.println("Unexpected value: " + charValue);
        }

        // puedes trabajar con String en el switch a partir de la version 7 de java
        String month = "january";
        switch(month) {
            case "January":
                System.out.println("JAN");
                break;
            case "June" :
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }
    }
}
