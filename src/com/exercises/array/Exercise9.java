package com.exercises.array;

import java.util.Arrays;

public class Exercise9 {

    /**
     * 9. Write a Java program to insert an element (specific position) into an array
     */
    public static void main(String[] args) {
        int[] originalArray = {1, 3, 4};
        int element = 2;
        int index = 0;

        int[] newArray = insertInto(originalArray, element, index);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array: " + Arrays.toString(newArray));

    }

    public static int[] insertInto(int[] array, int element, int index) {
        // Need to create a new array to accommodate the new element.
        int[] newArray = new int[array.length + 1];

        for(int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = element;

        for(int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }

}
