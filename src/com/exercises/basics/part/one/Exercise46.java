package com.exercises.basics.part.one;

public class Exercise46 {

    /**
     * 46. Write a Java program to display the system time.
     * Sample Output:
     *
     * Current Date time: Fri Jun 16 14:17:40 IST 2017
     */
    public static void main(String[] args) {
        System.out.println("Current date and time: " + System.currentTimeMillis());
        System.out.format("Current date and time (formated): %tc%n", System.currentTimeMillis());
    }
}
