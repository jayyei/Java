package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        // There are alternatives, such as making an anonymous inner class with an instance initializer
        // (also known as a "double brace initialization"):
        this.transactions = new ArrayList<Double>(){
            {
                add(initialTransaction);
            }
        };
        // Or
        // this.transactions = new ArrayList<Double>(List.of(initialTransaction));
        // Or
        // this.transactions = new ArrayList<Double>(Arrays.asList(initialTransaction));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction (double transaction) {
        this.transactions.add(transaction);
    }
}
