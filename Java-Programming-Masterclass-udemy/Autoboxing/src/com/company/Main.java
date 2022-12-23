package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList =  new ArrayList<String>();
        strArrayList.add("Tim");

        // Genericos solo funcionan con objetos, no con primitivos
        // ArrayList<int> intArrayList = new ArrayList<int>();

        // Autoboxing es la conversion acutomatica que java hace entre los tipos primitivos y sus correspondientes clases envoltorias
        // Unboxing es la operacion contraria; convertir una clase envoltoria a su correspondiente valor primitivo
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue;
    }
}
