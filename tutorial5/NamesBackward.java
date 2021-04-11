package com.company.tutorial.tutorial5;

public class NamesBackward {
    public static void main(String[] args) {
        String[] names = {"John", "Ritish", "Mario", "Alex", "Ryley", "Matt"};
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
