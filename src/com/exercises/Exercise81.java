package com.exercises;

import java.util.Arrays;

public class Exercise81 {
    /**
     * 81. Write a Java program to swap the first and last elements of an array (length must be at least 1)
     * and create a new array.
     * Sample Output:
     *
     * Original Array: [20, 30, 40]
     * New array after swaping the first and last elements: [40, 30, 20]
     */
    public static void main(String[] args) {

        int[] originalArray = {20, 30, 40};
        int[] newArray = swap(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New array after swaping the first and last elements: " + Arrays.toString(newArray));

    }

    public static int[] swap(int[] numbers) {

        if (numbers.length >= 1) {
            numbers = Arrays.copyOf(numbers, numbers.length);
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            numbers[0] = last;
            numbers[numbers.length - 1] = first;

            return numbers;
        }

        return  numbers;
    }
}
