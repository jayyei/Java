package com.company;

public class Main {

    private static int number;

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int aux = number;
        int sum = 0;
        do {
            // extract the lest-significant digit
            sum += aux % 10;

            // drop the least significant digit,
            aux /= 10 ; // same as aux = aux / 10;
        } while ( aux != 0  );

        return sum;
    }
}
