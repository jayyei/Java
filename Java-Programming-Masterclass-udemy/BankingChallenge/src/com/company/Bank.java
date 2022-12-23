package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            this.branches.add(new Branch(branchName));
        }
        return branch == null;

    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String branchName) {
        for (Branch branch:
             branches) {
            if(branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean isPrintedTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        System.out.println("Customer details for branch " + branch.getName());
        int i = 1;
        for (Customer customer:
             branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + i + "]");
            i++;
            if (!isPrintedTransactions) {
                continue;
            }
            System.out.println("Transactions");
            int j = 1;
            for (Double transaction:
                 customer.getTransactions()) {
                System.out.println("[" + j + "] " + " Amount " + transaction);
                j++;
            }
        }
        return true;
    }
}
