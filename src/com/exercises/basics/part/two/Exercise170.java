package com.exercises.basics.part.two;

public class Exercise170  {
    /**
     * 170. Write a Java program to find the length of the longest consecutive sequence of a given array of integers.
     *
     * Original array: [1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2]
     * 7
     */
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        int result = findLength(numbers);

        System.out.println("Result: " + result);

    }

    public static int findLength(int[] numbers) {

        int start = 0;
        int count = 0;
        int result = 0;

        while(start < numbers.length - 1) {

            for(int i = start; i < numbers.length; i ++) {
                count++;

                if(numbers[i] > numbers[i + 1]) {

                    if(start > result && i >= count) {
                        result = i;
                    }

                    start ++;
                    count = 0;
                    break;
                }

                start++;
            }

        }

        return result;
    }
}
