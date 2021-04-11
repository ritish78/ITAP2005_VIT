package com.company.tutorial.tutorial4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("Enter a sentence or a word: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character,Integer> characterCount = new HashMap<>();

        for (int i = 0; i < alphabet.length(); i++) {
            char alphChar = alphabet.charAt(i);
            for (int j = 0 ; j < input.length(); j++) {
                char inputChar = input.charAt(j);

                if (alphChar == inputChar) {
                    if (characterCount.containsKey(inputChar)) {
                        characterCount.put(inputChar, characterCount.get(inputChar) + 1);
                    } else {
                        characterCount.put(inputChar, 1);
                    }
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
