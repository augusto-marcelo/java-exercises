package com.exercises.array;

import java.util.Arrays;

public class Exercise15 {

    /**
     * 15. Write a Java program to find the common elements between two arrays of integers.
     */
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {6, 7, 8, 9, 1, 2};

        System.out.println("First array: " + Arrays.toString(first));
        System.out.println("Second array: " + Arrays.toString(second));

        findCommon(first, second);

    }

    public static void findCommon(int[] first, int[] second) {
        for(int i = 0; i < first.length; i++) {

            // for each round, traverse the entire second array
            for(int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) System.out.println("The element " + first[i] + " is common.");
            }

        }
    }
}
