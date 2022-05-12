package com.exercises.array;

import java.util.Arrays;

public class Exercise11 {

    /**
     * 11. Write a Java program to reverse an array of integer values.
     */
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(numbers));

        reverse(numbers);

        System.out.println("Reversed: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] numbers) {

        for(int i = 0; i < numbers.length - 1; i++) {
            int temp = numbers[numbers.length - i -1];
            numbers[numbers.length - i - 1] = numbers[i];
            numbers[i] = temp;
        }
    }
}
