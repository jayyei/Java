package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bobsAccount = new Bank("12345", 0.00, "Bob brown", "myemail@bob.com", "5581669223");

        // System.out.println(bobsAccount.getNumber());
        // System.out.println(bobsAccount.getBalance());
        // bobsAccount.withdrawal(100.0);
        // bobsAccount.deposit(50.0);
        // bobsAccount.withdrawal(100.0);
        //
        // bobsAccount.deposit(51.0);
        // bobsAccount.withdrawal(100.0);


        // Bank timsAccount = new Bank("Tim", "tim@email.com", "12345");
        // System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName() );


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email,com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
