package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMinIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue -1));

        int myMaxIntText = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimun Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
          System.out.println("Short Minimun Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 1000L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimun Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long biglongLiteralValue = 2_147_483_647_123L;
        System.out.println(biglongLiteralValue);


        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        // integer is assumed automatically by java
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);
        // The eight primitive data types are byte, short, int and long and
        // char, boolean, float and double

        // Java uses the concept of a Wrapper class for all eight primitive types
        // the case of int is Integer

        // byte occupies 8 bytes
        // short occupies 16 bits
        // int occupies 32 bits
        // long occupies 64 bits
        // all of these one are signed
    }
}
