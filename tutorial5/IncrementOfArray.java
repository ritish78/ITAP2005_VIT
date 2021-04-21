package com.company.tutorial.tutorial5;

import java.util.*;

public class IncrementOfArray {
    public static void main(String[] args) {
        int[] numbers = {25, 26, 90, 14, 35, 72, 20};


       String[] lists = {"abc", "2", "10", "0"};
       List<String> stringList = Arrays.asList(lists);
       Collections.sort(stringList);
        System.out.println(stringList);
        System.out.println(lists.toString());
        System.out.print(Arrays.toString(numbers));
    }
}
