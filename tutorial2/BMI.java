package com.company.tutorial.tutorial2;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in pounds(lb): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in inches(in): ");
        double height = scanner.nextDouble();

        double bmi = (weight * 0.45352937) / (height * 0.0254);

        System.out.println("Your BMI is " + bmi);
    }
}
