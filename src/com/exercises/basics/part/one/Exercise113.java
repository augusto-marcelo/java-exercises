package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise113 {

    /**
     * 113. Write a Java program to merge two given sorted array of integers
     * and create a new sorted array. Go to the editor
     * array1 = [1,2,3,4]
     * array2 = [2,5,7, 8]
     *
     * result = [1,2,2,3,4,5,7,8]
     */
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {2,5,7, 8};
        int[] result = mergeAndSort(array1, array2);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println("Merged & Sorted: " + Arrays.toString(result));

    }

    public static int[] mergeAndSort(int[] arrayOne, int[] arrayTwo) {
        // Step 1: let arrayOne and arrayTwo be the two unsorted int arrays
        // Step 2: Declare mergedArray with combined size of arrayA and ArrayB
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];

        // Step 3: Intialize traversing indices for all three arrays to 0
        int i=0, j=0, k=0; // i for arrayOne, j for arrayTwo, k for mergedArray

        // Step 4: Add all elements of arrayOne to mergedArray
        while(i < arrayOne.length) {
            mergedArray[k] = arrayOne[i];
            i++;
            k++;
        }

        // Step 5: Add all elements of arrayTwo to mergedArray
        while (j < arrayTwo.length) {
            mergedArray[k] = arrayTwo[j];
            j++;
            k++;
        }

        // Step 6: Now, sort the mergedArray using Arrays.sort() method.
        Arrays.sort(mergedArray);

        return  mergedArray;
    }
}
