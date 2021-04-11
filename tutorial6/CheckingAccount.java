package com.company.tutorial.tutorial6;

public class CheckingAccount extends Account{

    //Currently overdraw amount is just 50.
    private double overdraftAmount = -50;

    //No args constructor
    public CheckingAccount() {}

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= overdraftAmount) {
            super.withdraw(amount);
        } else {
            System.out.println("Can't withdraw more than overdraft limit");
        }
    }

    public String toString() {
        return "Checking account current balance: " + balance;
    }
}
