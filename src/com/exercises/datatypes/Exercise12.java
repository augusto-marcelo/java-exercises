package com.exercises.datatypes;

public class Exercise12 {
    /**
     * 12. Write a Java program to compare two given signed and unsigned numbers.
     * */
    public static void main(String[] args) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        int compare = Integer.compare(min, max);

        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
        System.out.println("Comparission = " + compare);
    }
}
