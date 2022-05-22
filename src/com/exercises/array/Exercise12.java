package com.exercises.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise12 {

    /**
     * 12. Write a Java program to find the duplicate values of an array of integer values
     */
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        ArrayList<Integer> duplicates = getDuplicates(numbers);

        System.out.println("Numbers array: " + Arrays.toString(numbers));
        System.out.println("Qtty of duplicates: " + duplicates.size());
        System.out.println("Duplicates: " + Arrays.toString(duplicates.toArray()));

    }

    public static ArrayList<Integer> getDuplicates(int[] numbers) {
        ArrayList<Integer> dups = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int occurrences = 0;

            for(int n: numbers) {
                if (dups.contains(n)) continue;
                if (n == current) occurrences++;
            }

            if(occurrences > 1) dups.add(current);
        }

        return dups;
    }
}
