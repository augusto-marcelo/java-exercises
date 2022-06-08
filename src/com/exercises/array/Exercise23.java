package com.exercises.array;

import java.util.Arrays;

public class Exercise23 {

    /**
     * 23. Write a Java program to test the equality of two arrays.
     * */
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 4};

        boolean equals = isEquals(first, second);

        System.out.println("First: " + Arrays.toString(first));
        System.out.println("Second: " + Arrays.toString(second));

        System.out.println("Is equals: " + equals);

    }

    public static boolean isEquals(int[] first, int[] second) {

        // If they are not of the same size, abort immediately
        if(first.length != second.length) return false;

        boolean elementsEquality = true;
        for(int i = 0; i < first.length; i++) {
            if(first[i] != second[i]) {
                elementsEquality = false;
                break;
            }
        }

        return elementsEquality || false;
    }
}
