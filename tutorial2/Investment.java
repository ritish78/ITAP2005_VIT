package com.company.tutorial.tutorial2;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investedAmount = scanner.nextDouble();
        System.out.print("Enter the monthly interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the number of years to invest: ");
        double noOfYears = scanner.nextDouble();

        double futureInvestmentValue = investedAmount * Math.pow((1 + (interestRate / 100) / 12), (noOfYears * 12));

        System.out.println("In " + noOfYears + " years, your invested amount will result into: " + futureInvestmentValue);
    }
}
