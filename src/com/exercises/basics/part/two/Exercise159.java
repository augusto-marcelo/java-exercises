package com.exercises.basics.part.two;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Exercise159 {

    /**
     * 159. Write a Java program to find the k largest elements in a given array.
     * Elements in the array can be in any order.
     *
     * Expected Output:
     * Original Array:
     * [1, 4, 17, 7, 25, 3, 100]
     * 3 largest elements of the said array are:
     * 100 25 17
     */
    public static void main(String[] args) {
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        int[] result = largestValues(numbers, k);

        System.out.println("Original array" + Arrays.toString(numbers));
        System.out.println("k = " + k);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] largestValues(int[] numbers, int k) {
        int[] result = new int[k];
        int[] copy = numbers.clone();
        selectionSort(copy);

        for(int i = 1; i <= k; i++) {
            result[i - 1] = copy[copy.length - i];
        }

        return result;
    }

    public static void selectionSort(int[] sortMe) {
        for(int i = 0; i < sortMe.length; i++) {
            int index = i;
            for(int j = i+1; j < sortMe.length; j++) {
                if(sortMe[j] < sortMe[index]) {
                    index = j;
                }
            }
            int smallerNumber = sortMe[index];
            sortMe[index] = sortMe[i];
            sortMe[i] = smallerNumber;
        }
    }

}
