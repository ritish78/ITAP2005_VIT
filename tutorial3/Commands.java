package com.company.tutorial.tutorial3;

import java.util.Scanner;

public class Commands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.print("Enter command: ");
        command = scanner.nextLine();
        if (command.equalsIgnoreCase("start")) {
            while (true) {
                System.out.print("Enter command: ");
                command = scanner.nextLine();

                if (command.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    System.out.println("Unrecognised command: " + command);
                }
            }
        }
    }
}
