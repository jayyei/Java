package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = Main.reverse(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(myArray));
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int[] reverse(int[] array) {
        for ( int i = 0; i < array.length / 2; i++)  {
            int temp = array[i];
            array[i] = array[array.length -1 - i];
            array[array.length -1- i] =  temp;
        }
        return array;
    }
}
