package com.company.tutorial.tutorial2;

import java.util.Scanner;

public class EnergyNeeded {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial temperature of water in Celsius: ");
        double iniTemp = scanner.nextDouble();
        System.out.print("Enter the final temperature of water in Celsius: ");
        double finalTemp = scanner.nextDouble();
        System.out.print("Enter the amount of water used in kg: ");
        double weightOfWater = scanner.nextDouble();

        double energyRequired = weightOfWater * (finalTemp - iniTemp) * 4184;

        System.out.println("The amount of energy required is: " + energyRequired + " Joules");
    }
}

