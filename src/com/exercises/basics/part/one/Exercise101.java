package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise101 {
    /**
     * 101. Write a Java program to check if the number
     * of 10 is greater than number to 20's in a given array of integers.
     */
    public static void main(String[] args) {

        int[] numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        boolean result = countTens(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Result: " + result);
    }

    public static boolean countTens(int[] numbers) {
        int quantityOfTens = 0;
        int quantityOfTwenty = 0;

        for(int num: numbers) {
            if (num == 10) {
                quantityOfTens++;
            } else if (num == 20) {
                quantityOfTwenty++;
            }
        }

        return quantityOfTens > quantityOfTwenty;
    }
}
