package com.company.tutorial.tutorial6;

import java.util.Date;

public class ElapsedTime {

    public static void main(String[] args) {
        Date date = new Date();

        for (long i = 10000L; i < 100000000000L; i *= 10) {
            date.setTime(i);
            System.out.println(date);
        }
    }
}
