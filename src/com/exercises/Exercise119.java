package com.exercises;

import java.util.Arrays;

public class Exercise119 {
    /**
     * 119. Write a Java program to get the first occurrence
     * (Position starts from 0.) of an element of a given array.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3};
        int search = 30;
        int firstOcurrenceIndex = firstOcurrence(search, numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Search for: " + search);
        System.out.println("First Ocurence Index: " + firstOcurrenceIndex);
    }

    public static int firstOcurrence(int element, int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
