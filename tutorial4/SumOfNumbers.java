package com.company.tutorial.tutorial4;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + ". Enter a number: ");
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println("The sum: " + sum);


    }
}
