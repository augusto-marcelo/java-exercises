package com.exercises.array;

import java.util.Arrays;

public class Exercise11 {

    /**
     * 11. Write a Java program to reverse an array of integer values.
     */
    public static void main(String[] args) {

        int[] numbers = {22, 323, 23, 333, 444};

        System.out.println("Original array: " + Arrays.toString(numbers));

        reverse(numbers);

        System.out.println("Reversed: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        for(int i = start; i <= end; i++) {
            int temp = numbers[end];

            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }
}
