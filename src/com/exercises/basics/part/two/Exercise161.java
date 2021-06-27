package com.exercises.basics.part.two;

import java.util.Arrays;

public class Exercise161 {
    /**
     * 161. Write a Java program to find the kth smallest and largest element in a
     * given array. Elements in the array can be in any order. Go to the editor
     *
     * Expected Output:
     * Original Array:
     * [1, 4, 17, 7, 25, 3, 100]
     * K'th smallest element of the said array:
     * 3
     * K'th largest element of the said array:
     * 25
     * */
    public static void main(String[] args) {

        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        sortIntArray(numbers);
        //sort(numbers);

        System.out.println("Ordered Array: " + Arrays.toString(numbers));




    }

    public static void sortIntArray(int[] numbers) {
        int numbersLength = numbers.length;

        for(int i = 0; i < numbersLength - 1; i++) {
            int minIndex = i;

            for(int j = i+1; j < numbersLength; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;

        }
    }

    static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
