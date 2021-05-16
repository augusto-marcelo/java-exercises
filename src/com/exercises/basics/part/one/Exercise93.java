package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise93 {
    /**
     * 93. Write a Java program to test if an array of
     * integers contains an element 10 next to 10 or an element 20 next to 20, but not both.
     */
    public static void main(String[] args) {

        int[] numbers = {10, 10, 2, 4, 20, 30};
        boolean result = check(numbers);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Result: " + result);
    }

    public static boolean check(int[] numbers) {
        boolean repeatedTens = false;
        boolean repeatedTwenties = false;

        for (int n = 0; n < numbers.length - 1; n++) {
            if (numbers[n] == 10) {
                if (numbers[n] == numbers[n + 1]) {
                    repeatedTens = true;
                }
            }

            if (numbers[n] == 20) {
                if (numbers[n] == numbers[n + 1]) {
                    repeatedTwenties = true;
                }
            }
        }

        return repeatedTens ^ repeatedTwenties;
    }
}
