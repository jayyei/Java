package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at "+ i +  "% interest = " +  String.format("%.2f",calculateInterest(10000.0, i)));
        }

        // a partir de un determinado rango, dame los primeros 3 numeros primos
        int count = 0;
        for (int j = 0; j < 10; j ++) {
            if (isPrime(j)) {
                System.out.println(j);
                count ++;
            }
            if (count == 3) {
                break;
            }
        }
        for (int i = 0; i <5;) {
            if (i % 2 == 0 ) {
                i++;
                continue;
            }
            i += 2;
            System.out.println("For weird " + i);
        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return  false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i ++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
