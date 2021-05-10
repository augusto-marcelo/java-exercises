package com.exercises;

import java.util.concurrent.TimeUnit;

public class Exercise91 {

    /**
     * 91. Write a Java program to measure how long some code takes to execute in nanoseconds.
     */
    public static void main(String[] args) {
        long start = System.nanoTime();

        int counter = 0;
        for(int x = 0; x < 100; x++){
            counter++;
        }

        try {
            Thread.sleep(10000 * 6);
        } catch( Exception e) {
            System.out.println("Error in thread.sleep");
        }




        long end = System.nanoTime();

        System.out.println("Start time: " + Long.toString(start));
        System.out.println("End time: " + Long.toString(end));
        System.out.println("Total (nano secs): " + Long.toString(end - start));

        long convert = TimeUnit.SECONDS.convert(end - start, TimeUnit.NANOSECONDS);

        System.out.println("Total (secs): " + convert);
    }
}
