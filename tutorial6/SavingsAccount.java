package com.company.tutorial.tutorial6;

public class SavingsAccount extends Account{

    //No args constructor
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            super.withdraw(amount);
        } else {
            System.out.println("Can't withdraw more than balance.");
        }
    }

    public String toString() {
        return "Saving account current balance: " + balance;
    }
}
