package com.exercises.array;

import java.util.Arrays;

public class Exercise6 {
    /**
     * 6. Write a Java program to find the index of an array element.
     * */
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 40};
        int element = 40;

        int idx = getElementIndex(array, element);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Looking for element: " + element);

        if(idx >= 0) {
            System.out.println("Element located at index: " + idx);
        } else {
            System.out.println("Element could not be found.");
        }
    }

    /**
     * @param array Integer array
     * @param element Element to look for
     * @return The element index or -1 if not found
     */
    public static int getElementIndex(int[] array, int element) {
        for(int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                return index;
            }
        }

        return -1;
    }
}
