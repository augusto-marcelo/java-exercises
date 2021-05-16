package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise79 {

    /**
     * 79. Write a Java program to rotate an array (length 3) of integers in left direction.
     * Sample Output:
     *
     * Original Array: [20, 30, 40]
     * Rotated Array: [30, 40, 20]
     */
    public static void main(String[] args) {
        int[] originalArray = {20, 30, 40};

        System.out.println(Arrays.toString(rotate(originalArray)));
    }

    public static int[] rotate(int[] numbers) {
        int[] rotated = new int[3];

        for(int i = 0; i < numbers.length - 1; i++) {
            rotated[i] = numbers[i+1];
            rotated[i + 1] = numbers[0];
        }

        return rotated;
    }
}
