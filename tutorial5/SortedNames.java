package com.company.tutorial.tutorial5;

import java.util.Arrays;
import java.util.Scanner;

public class SortedNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        for (int i = 0; i < 10; i++){
            System.out.print((i + 1) + ". Please enter a name: ");
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);
        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(names));
    }
}
