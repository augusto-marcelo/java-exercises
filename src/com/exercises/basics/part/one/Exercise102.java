package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise102 {
    /**
     * 102. Write a Java program to check if a specified array of integers contains 10's or 30's.
     */
    public static void main(String[] args) {
        int numbers[] = {11, 11, 13, 31, 45, 20, 33, 53};
        boolean result = contains(numbers);

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Result: " + result);
    }

    public static boolean contains(int[] numbers) {
        for(int n: numbers) {
            if(n == 10 || n == 30) {
                return true;
            }
        }

        return false;
    }
}
