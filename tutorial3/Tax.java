package com.company.tutorial.tutorial3;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter income to calculate tax: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Your taxable amount: " + tax);
    }

    public static double calculateTax(double income) {
        double tax;
        if (income <= 20000) {
            tax = 0;
        } else if (income > 20000 && income <= 50000) {
            tax = income * 0.05;
        } else if (income > 50000 && income <= 75000) {
            tax = income * 0.15;
        } else if (income > 75000 && income <= 150000) {
            tax = income * 0.2;
        } else if (income > 150000 && income <= 250000) {
            tax = income * 0.35;
        } else {
            tax = income * 0.4;
        }

        return tax;
    }
}
