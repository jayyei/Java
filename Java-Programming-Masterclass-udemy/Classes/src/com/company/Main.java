package com.company;

public class Main {

    public static void main(String[] args) {
        Car porshe = new Car();
        Car holden = new Car();
        porshe.setModel("911");
        System.out.println("Model is " + porshe.getModel());
    }
}
