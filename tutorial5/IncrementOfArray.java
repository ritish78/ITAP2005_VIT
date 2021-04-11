package com.company.tutorial.tutorial5;

import java.util.Arrays;

public class IncrementOfArray {
    public static void main(String[] args) {
        int[] numbers = {25, 26, 90, 14, 35, 72, 20};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]++;
        }
        System.out.print(Arrays.toString(numbers));
    }
}
