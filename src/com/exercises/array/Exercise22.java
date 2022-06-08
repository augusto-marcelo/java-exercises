package com.exercises.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise22 {

    /**
     * 22. Write a Java program to find all pairs of elements in an
     * array whose sum is equal to a specified number.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sum = 7;

        ArrayList<Integer> pairs = pairSumEquals(numbers, sum);

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
        System.out.println("Pairs: " + pairs.toString());
    }

    public static ArrayList<Integer> pairSumEquals(int[] numbers, int sum) {
        ArrayList<Integer> pairs = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++) {

            for(int j = 0; j < numbers.length; j++) {
                if(j == i) continue;

                if(numbers[i] + numbers[j] == sum) {
                    if(pairs.contains(numbers[i]) && pairs.contains(numbers[j])) continue;;

                    pairs.add(numbers[i]);
                    pairs.add(numbers[j]);
                }
            }
        }

        return pairs;
    }

}
