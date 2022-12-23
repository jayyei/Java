package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numbersToRead = 10;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int validNumbers = 0;
        System.out.println("Write 10 numbers");
        while(numbersToRead>0) {
            System.out.println("Enter number #" + (11 - numbersToRead) + "" + "\n");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                validNumbers+=number;
                numbersToRead--;
            } else {
                System.out.println("Invalid Number" +  "\n");
            }
            scanner.nextLine();
        }
        System.out.println("total = " + validNumbers);
        scanner.close();
    }
}
