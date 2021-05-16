package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise100 {
    /**
     * 100. Write a Java program to count the two elements
     * of two given arrays of integers with same length, differ by 1 or less.
     */
    public static void main(String[] args) {
        int[] arrayOne = {10, 11, 10, 20, 43, 20, 50};
        int[] arrayTwo = {10, 13, 11, 20, 44, 30, 50};

        int result = countDiff(arrayOne, arrayTwo);

        System.out.println("Array One: " + Arrays.toString(arrayOne));
        System.out.println("Array Two: " + Arrays.toString(arrayTwo));
        System.out.println("Result: " + result);

    }

    public static int countDiff(int[] arrayOne, int[] arrayTwo) {
        int counter = 0;
        for(int n = 0; n < arrayOne.length; n++) {
            if(Math.abs(arrayOne[n] - arrayTwo[n]) == 1) {
                counter++;
            }
        }

        return counter;
    }
}
