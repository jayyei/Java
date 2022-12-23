package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Branch myBranch = new Branch("Jay");
        myBranch.newCustomer("Pepe", 200);
        myBranch.addCustomerTransaction("Pepe", 300);

        for (Customer customer:
             myBranch.getCustomers()) {
            System.out.println(customer.getName() + " ");
            System.out.println("Transactions: ");
            for (Double transaction:
                 customer.getTransactions()) {
                System.out.println(transaction);
            }
        }
    }
}
