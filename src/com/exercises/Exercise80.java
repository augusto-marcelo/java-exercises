package com.exercises;

import java.util.Arrays;

public class Exercise80 {

    /**
     * 80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers
     * Sample Output:
     *
     * Original Array: [20, 30, 40]
     * Larger value between first and last element: 40
     */
    public static void main(String[] args) {

        int[] originalArray = {90, 30, 40};
        int larger = findLarger(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Larger value between first and last element: " + larger);

    }

    public static int findLarger(int[] numbers) {
        int larger = numbers[0] > numbers[numbers.length - 1] ? numbers[0]: numbers[numbers.length - 1];

        return larger;
    }
}
