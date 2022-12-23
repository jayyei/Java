package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFeetAndInchesToCentimeters(6, 34));
    }

    public static double calcFeetAndInchesToCentimeters( double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double totalInches = inches + (feet * 12);
            return totalInches * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int) inches / 12;
            int remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);

        } else {
            return -1;
        }
    }
}
