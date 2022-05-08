package com.exercises.array;

import java.util.Arrays;

public class Exercise7 {

    /**
     * 7. Write a Java program to remove a specific element from an array
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int element = 3;

        int[] newArray = removeArrayElement(array, element);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Removing element: " + element);
        System.out.println("New Array = " + Arrays.toString(newArray));

    }

    public static int[] removeArrayElement(int[] array, int element) {
        int idx = getElementIndex(array, element);

        if(idx >= 0) {
            int[] newArray = new int[array.length - 1];

            for(int n = 0; n < idx; n++) {
                newArray[n] = array[n];
            }

            for(int n = idx; n < newArray.length ; n++) {
                newArray[n] = array[n +1];
            }

            return  newArray;
        }

        return array;
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
