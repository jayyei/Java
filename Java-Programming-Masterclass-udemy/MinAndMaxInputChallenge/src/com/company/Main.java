package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number = 0;
        while(true) {
            System.out.println("Enter number");
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
                scanner.nextLine();
                if (number > max) {
                    max = number;
                }
                if(min > number){
                    min = number;
                }
            } else {
                break;
            }
        }
        System.out.println("The max and min values were " + max + " and " + min);
        scanner.close();
        double a = 10 / 3;
    }
}
