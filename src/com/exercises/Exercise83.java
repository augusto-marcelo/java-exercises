package com.exercises;

import java.util.Arrays;

public class Exercise83 {
    /**
     * 83. Write a Java program to multiply corresponding elements of two arrays of integers.
     * Sample Output:
     *
     * Array1: [1, 3, -5, 4]
     *
     * Array2: [1, 4, -5, -2]
     *
     * Result: 1 12 25 -8
     */
    public static void main(String[] args) {

        int [] arrayOne = {1, 3, -5, 4};
        int [] arrayTwo = {1, 4, -5, -2};
        int [] result = multiplyCorrespondents(arrayOne, arrayTwo);

        System.out.println("Array1: " + Arrays.toString(arrayOne));
        System.out.println("Array2: " + Arrays.toString(arrayTwo));
        System.out.println("Result: " + Arrays.toString(result));

    }

    public static int[] multiplyCorrespondents(int[] listOne, int[] listTwo) {
        int[] result = new int[listOne.length];

        for(int num = 0; num < listOne.length; num++) {
            result[num] = listOne[num] * listTwo[num];
        }

        return result;
    }
}
