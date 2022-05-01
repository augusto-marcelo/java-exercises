package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise5 {

    /**
     * 5. Write a Java program that prints the current time in GMT.
     *
     * Test Data
     * Input the time zone offset to GMT: 256
     *
     * Expected Output:
     * Current time is 23:40:24*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the timezone offset to GMT: ");
        long timeZoneChange = sc.nextInt();

        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}
