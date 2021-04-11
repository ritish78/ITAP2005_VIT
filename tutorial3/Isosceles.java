package com.company.tutorial.tutorial3;

import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of one side of a triangle: ");
        double l1 = scanner.nextDouble();
        System.out.print("Enter length of second side of a triangle: ");
        double l2 = scanner.nextDouble();
        System.out.print("Enter length of third side of a triangle: ");
        double l3 = scanner.nextDouble();

        boolean isosceles = checkIfIsosceles(l1, l2, l3);

        if (isosceles) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }

    public static boolean checkIfIsosceles(double l1, double l2, double l3) {
        if ((l1 + l2) == l3) {
            return true;
        } else if ((l1 + l3) == l2) {
            return true;
        } else if ((l2 + l3) == l1) {
            return true;
        } else {
            return false;
        }
    }
}
