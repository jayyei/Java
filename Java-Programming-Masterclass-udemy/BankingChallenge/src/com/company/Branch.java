package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer customer = findCustomer(customerName);
        if (customer == null)
        this.customers.add(new Customer(customerName, initialTransaction));
        return customer == null;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer !=  null) {
            customer.addTransaction(transaction);
        }
        return customer !=  null;
    }

    private Customer findCustomer(String name) {
        for (Customer customer:
              customers) {
            if(customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
