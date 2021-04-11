package com.company.tutorial.tutorial5;

import java.util.Arrays;
import java.util.Scanner;

public class SortedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("The sorted array of number is: ");
        System.out.println(Arrays.toString(numbers));
    }
}
