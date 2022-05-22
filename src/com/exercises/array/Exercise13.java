package com.exercises.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise13 {
    /**
     * 13. Write a Java program to find the duplicate values of an array of string values
     * */
    public static void main(String[] args) {

        String[] array = {"asdf", "asdf", "qwerty", "qwerty"};
        ArrayList<String> duplicates = findDuplicates(array);

        System.out.println("Numbers array: " + Arrays.toString(array));
        System.out.println("Qtty of duplicates: " + duplicates.size());
        System.out.println("Duplicates: " + Arrays.toString(duplicates.toArray()));

    }

    public static ArrayList<String> findDuplicates(String[] array) {
        ArrayList<String> dups = new ArrayList<String>();

        for(int i = 0; i < array.length; i++) {
            String current = array[i];
            int occurrences = 0;

            for(String n: array) {
                if (dups.contains(n)) continue;
                if (n == current) occurrences++;
            }

            if(occurrences > 1) dups.add(current);
        }

        return dups;
    }
}
