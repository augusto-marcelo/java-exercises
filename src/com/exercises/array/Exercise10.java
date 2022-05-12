package com.exercises.array;

import java.util.Arrays;

public class Exercise10 {

    /**
     * 10. Write a Java program to find the maximum and minimum value of an array
     * */
    public static void main(String[] args) {
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int minIndex = findMin(numbers);
        int maxIndex = findMax(numbers);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("The maximum number is: " + numbers[maxIndex] + " at postion: " + maxIndex);
        System.out.println("The minimum number is: " + numbers[minIndex] + " at postion: " + minIndex);

    }

    public static int findMax(int[] numbers) {
        int maxIdx = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > numbers[maxIdx]) {
                maxIdx = i;
            }
        }

        return maxIdx;
    }

    public static int findMin(int[] numbers) {
        int minIdx = 0;

        for(int i = 0; i < numbers.length; i++) {

            if (numbers[i] < numbers[minIdx]) {
                minIdx = i;
            }
        }

        return  minIdx;
    }
}
