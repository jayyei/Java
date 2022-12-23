package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5 / 3f;
        double myDoubleValue = 5.00 / 3.00; //Double is accepted by the default
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double factorToConvert = 0.45359237;
        int kilograms = 12;
        double resultOfConvertion = kilograms / factorToConvert;
        System.out.println(kilograms + " kilograms" + " to pounds " + resultOfConvertion);

        double numberOfPounds = 200;
        double convertedKilograms = numberOfPounds * factorToConvert;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi = 3.14159927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        System.out.println(0.1 + 0.2);
    }
    // Single and double precision
    // precision refers to hte format and amount of space occupied by the type
    // float 32 bits has a range from 1.4E-45 to 3.4028235E+38
    // double 64 bits is from 4.9E-324 to 1.7976931348623157E+308

}
