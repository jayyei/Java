package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        while(count !=5) {
            System.out.println("Count value is " + count );
            count ++;
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count ++;
        } while( count < 10);

        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int counter = 0;
        while (number <= finishNumber) {
            number ++;
            if (!isEvenNumber(number)) {
                continue;
            }
            sum += number;
            counter ++;
            System.out.println("Even number " + number);
            if (counter >= 5) {
                break;
            }
        }
        System.out.println("Total even sum " + sum);

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
