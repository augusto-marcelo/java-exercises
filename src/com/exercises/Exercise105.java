package com.exercises;

import java.util.Arrays;

public class Exercise105 {
    /**
     * 105. Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.
     */
    public static void main(String[] args) {
        int[] numbers = {11, 15, 13, 10, 45, 20, 11, 15};
        boolean validation = validate(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Validation: " + String.valueOf(validation));

    }

    public static boolean validate(int[] numbers) {
        int group[] = {numbers[0], numbers[1]};
        int groupLength = group.length;
        boolean startsWith = true;
        boolean endsWith = true;

        for(int i = 0; i < groupLength; i++) {
            if(group[i] != numbers[i]) {
                startsWith = false;
                break;
            }
        }

        int counter = 0;
        for(int i = numbers.length - groupLength; i < numbers.length; i++) {
            if(group[counter] != numbers[i]) {
                endsWith = false;
                break;
            }
            counter++;
        }

        return startsWith && endsWith;
    }

}
