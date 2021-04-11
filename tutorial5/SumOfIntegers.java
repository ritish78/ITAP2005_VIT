package com.company.tutorial.tutorial5;

public class SumOfIntegers {
    public static void main(String[] args) {
        int[] values = {25, 26, 90, 14, 35, 72, 20};
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println("The sum is " + sum);
    }
}
