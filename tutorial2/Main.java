package com.company.tutorial.tutorial2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area of cylinder: " + area);
        System.out.println("The volume of cylinder: " + volume);
    }
}
