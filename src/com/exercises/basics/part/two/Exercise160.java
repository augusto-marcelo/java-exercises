package com.exercises.basics.part.two;

import java.util.Arrays;

public class Exercise160 {
    /**
     * 160. Write a Java program to find the k smallest elements in a given array.
     * Elements in the array can be in any order. Go to the editor
     *
     * Expected Output:
     * Original Array:
     * [1, 4, 17, 7, 25, 3, 100]
     * 3 largest elements of the said array are:
     * 100 25 17
     */
    public static void main(String[] args) {
        int quantity = 5;
        int[] originalArray = {1, 4, 17, 7, 25, 3, 100};

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        insertionSort(originalArray);

        System.out.println("Sorted: " + Arrays.toString(originalArray));

        System.out.println("The " + quantity + " smallest elements are: ");
        for(int i = 0; i < quantity; i++) {
            System.out.print(originalArray[i]);
            if ((i + 1) < quantity)
                System.out.print(", ");
        }

        System.out.println();

    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i -1;

            while(j > 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
}
