package com.exercises.basics.part.two;

import java.util.Arrays;

public class Exercise165 {
    /**
     * 165. Write a Java program to move every positive number to the right and every
     * negative number to the left of a given array of integers. Go to the editor
     *
     * Expected Output:
     * Original array: [-2, 3, 4, -1, -3, 1, 2, -4, 0]
     * Result: [-4, -3, -2, -1, 0, 1, 2, 3, 4]
     */
    public static void main(String[] args) {

        int[] numbers = {-2, 3, 4, -6, -3, 1, 2, -4, 0};

        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Reordering...");

        shift(numbers);

        System.out.println("Result: " + Arrays.toString(numbers));

    }

    public static void shift(int[] numbers) {

        for(int i = 0; i < numbers.length; i++) {
            int nextNegative = findNegative(numbers, i);

            if(nextNegative < 0) {
                return;
            }

            if(nextNegative >= i && numbers[i] >= 0) {
                int temp = numbers[nextNegative];

                numbers[nextNegative] = numbers[i];
                numbers[i] = temp;
            }
        }

    }

    public static int findNegative(int[] numbers, int start) {
        for(int i = start; i < numbers.length; i++) {
            if (numbers[i] <= 0)
                return i;
        }

        return -1;
    }
}
