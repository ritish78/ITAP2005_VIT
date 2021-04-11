package com.company.tutorial.tutorial8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        String fileName = "Exercise12_15.txt";

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println(fileName + " exists!");
        } else {
            createFile(file);
        }
        readFile(file);
    }


    public static void createFile(File file) {
        //To write random numbers in the file
        int num;
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                num = (int) (Math.floor(Math.random() * 100) + 1);
                printWriter.print(num);
                printWriter.print(" ");
            }
        } catch (IOException ex) {
            System.out.println("Error in writing random number to file!");
        }
    }

    public static void readFile(File file) {
        //Reading from file
        ArrayList<Integer> dataFromFile = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                dataFromFile.add(fileScanner.nextInt());
            }
        } catch (IOException ex) {
            System.out.println("Error in reading from file!");
        }

        //Using method provided from Collections class to sort numbers
        Collections.sort(dataFromFile);

        //Finally, printing the numbers
        for (Integer number : dataFromFile) {
            System.out.print(number + " ");
        }
    }
}
