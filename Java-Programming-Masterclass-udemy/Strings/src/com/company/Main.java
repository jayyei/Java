package com.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // The string is a datatype in java, is not a primitive type. It's actually a class.
        // but it enjoys a bit of favoritism in java to make it easer to user than a regular class

        // String is a sequence os characters

        String myString = new String("this is my string");
        System.out.println("MyString is equal to " + myString);
        myString = myString + '\u00A9';
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        // Strings in java are inmutable


        // Abbreviating operators
        // result++; --> result = result  + 1;
        // result--; --> result = result - 1;
        // result+=2; --> result = result + 2;
        // result*=10; --> result = result * 10;
        // result/=3; --> result = result / 3;
        // result-=2; --> result = result - 2;

    }
}
