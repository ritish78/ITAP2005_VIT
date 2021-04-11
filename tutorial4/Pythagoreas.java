package com.company.tutorial.tutorial4;

import java.util.Scanner;

public class Pythagoreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of one side of triangle: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter the length of other side of triangle: ");
        double length2 = scanner.nextDouble();

        double length3Squared = Math.pow(length1, 2) + Math.pow(length2, 2);
        double length3 = Math.sqrt(length3Squared);

        System.out.println("The length of hypotenuse is: " + length3);
    }
}
