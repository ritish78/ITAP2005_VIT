package com.company.tutorial.tutorial6;

public class AccountTest {

    public static void main(String[] args) {
        Account firstAccount = new Account(1122, 20000);

        SavingsAccount savingsAccount = new SavingsAccount(1123, 5000);
        CheckingAccount checkingAccount = new CheckingAccount(1124, 5000);

        System.out.println(firstAccount);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);

        savingsAccount.withdraw(5000);
        System.out.println(savingsAccount);

        checkingAccount.withdraw(5050);
        System.out.println(checkingAccount);
    }
}
