package com.exercises;

import java.util.Arrays;

public class Exercise106 {
    /**
     * 106. Write a Java program to create a new array that is left shifted from a given array of integers.
     */
    public static void main(String[] args) {

        int[] numbers = {11, 15, 13, 10, 45, 20};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        shiftLeft(numbers);
        System.out.println("Left shifited: " + Arrays.toString(numbers));

    }

    public static void shiftLeft(int[] numbers) {
        int first, second;
        for(int n = 0; n < numbers.length - 1; n++) {
            first = numbers[n];
            second = numbers[n + 1];

            numbers[n] = second;
            numbers[n + 1] = first;
        }
    }
}
