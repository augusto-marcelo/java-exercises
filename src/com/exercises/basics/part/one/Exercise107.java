package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise107 {
    /**
     * 107. Write a Java program to check if an array of integers contains three increasing adjacent numbers
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 3, 4, 7};
        boolean result = check(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Result: " + String.valueOf(result));

    }

    public static boolean check(int[] numbers) {
        for(int i = 0; i < numbers.length - 2; i++) {
            if(numbers[i] < numbers[i + 1] && numbers[i + 1] < numbers[i + 2]) {
                return true;
            }
        }

        return false;
    }
}
