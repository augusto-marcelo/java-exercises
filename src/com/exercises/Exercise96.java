package com.exercises;

import java.util.Arrays;

public class Exercise96 {

    /**
     * 96. Write a Java program to check if there is a 10 in a
     * given array of integers with a 20 somewhere later in the array.
     */
    public static void main(String[] args) {
        int[] numbers = {10, 70, 80, 50, 20, 13, 50};
        boolean result = validate(numbers);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Result: " + result);

    }

    public static boolean validate(int[] numbers) {
        int firstTenIndex = 0;
        int twentyIndex = 0;

        for(int n = 0; n < numbers.length; n++) {
            if(numbers[n] == 10) {
                firstTenIndex = n;
            } else if(numbers[n] == 20) {
                twentyIndex = n;
            }
        }

        return  twentyIndex > firstTenIndex;
    }
}
