package com.exercises.basics.part.two;

import java.util.Arrays;

public class Exercise167 {
    /**
     * 167. Write a Java program to move every zero to the right side of a given array of integers.
     *
     * Original array: [0, 3, 4, 0, 1, 2, 5, 0]
     * Result: [3, 4, 1, 2, 5, 0, 0, 0]
     */

    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 3, 4, 0, 1, 2, 5, 0};

        boolean swap = true;

        System.out.println("Original Array: " + Arrays.toString(numbers));

        while(swap) {
            swap = false;
            for(int i = 0; i < numbers.length - 1; i++) {

                if(numbers[i] == 0 && numbers[i+1] != 0) {
                        swap(numbers, i, i+1);
                        swap = true;
                }

            }
        }

        System.out.println("Result: " + Arrays.toString(numbers));
    }

    public static void swap(int[] numbers, int prev, int next) {
        int temp = numbers[next];
        numbers[next] = numbers[prev];
        numbers[prev] = temp;
    }
}


