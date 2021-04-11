package com.company.tutorial.tutorial2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("The year: " + year + " is a leap year");
        } else {
            System.out.println("The year: " + year + " is not a leap year");
        }
    }
}
