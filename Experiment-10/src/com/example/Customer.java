package com.example;

public class Customer {
    public String firstName;
    public String lastName;
    public Branch branch;
    public double balance;

    public Customer(String firstName, String lastName, Branch branch, double balance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.branch=branch;
        this.balance=balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Branch getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

}