package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.println("i = " + i);
            if (counter == 5) {
                break;
            }
            if (i % 3  == 0 && i % 5 == 0) {
                System.out.println("Found number = " +i);
                counter ++;
                sum += i;
            }
        }
        System.out.println("Sum " + sum);
    }
}
