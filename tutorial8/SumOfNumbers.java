package com.company.tutorial.tutorial8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter two numbers: ");
        while (true) {
            try{
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();

                break;
            } catch (InputMismatchException ex) {
                System.out.print("Please enter only numbers: ");
                scanner.nextLine();
            }
        }
        System.out.println("The sum is: " + (num1 + num2));
    }
}
