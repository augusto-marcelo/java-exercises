package com.exercises;

import java.util.Arrays;

public class Exercise98 {
    /**
     * 98. Write a Java program to check if the value 20
     * appears three times and no 20's are next to each other in a given array of integers.
     */
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 10, 40, 20, 20};

        boolean result = check(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Result: " + String.valueOf(result));

    }

    public static boolean check(int[] numbers) {
        int quantityTwenty = 0;

        for(int num = 0; num < numbers.length; num++) {

            if(num < numbers.length - 2 && numbers[num] == 20 && numbers[num + 1] != 20) {
                quantityTwenty++;
            } else if(numbers[num] == 20 && numbers[num - 1] != 20) {
                quantityTwenty ++;
            }
        }

        return quantityTwenty == 3;
    }
}
