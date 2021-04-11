package com.company.tutorial.tutorial4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to create multiplication table: ");
        int num = scanner.nextInt();

        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(Integer num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
