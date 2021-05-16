package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise77 {

    /**
     * 77. Write a Java program to create a new array of length 2 from two arrays of integers
     * with three elements and the new array will contain the first and last elements from the two arrays.
     *
     * Go to the editor
     * Test Data:
     *
     * array1 = 50, -20, 0
     * array2 = 5, -50, 10
     * Sample Output:
     *
     * Array1: [50, -20, 0]
     * Array2: [5, -50, 10]
     * New Array: [50, 10]
     */
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println("New Array: " + Arrays.toString(extract(array1, array2)));
    }

    public static int[] extract(int[] one, int[] two) {
        int newArray[] = {one[0], two[two.length - 1]};

        return newArray;
    }
}
