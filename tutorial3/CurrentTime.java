package com.company.tutorial.tutorial3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        String TIME_FORMATTER = "HH:mm:ss";
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Time: " + currentTime.format(DateTimeFormatter.ofPattern(TIME_FORMATTER)));
    }
}
