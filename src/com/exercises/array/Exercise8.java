package com.exercises.array;

import java.util.Arrays;

public class Exercise8 {

    /**
     * 8. Write a Java program to copy an array by iterating the array
     * */
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6};
        int[] copy = copy(source);

        System.out.println("Original Array: " + Arrays.toString(source));
        System.out.println("Copy: " + Arrays.toString(copy));
    }

    public static int[] copy(int[] source) {

        int[] copy = new int[source.length];

        for(int i = 0; i < source.length; i++) {
            copy[i] = source[i];
        }

        return copy;
    }
}
