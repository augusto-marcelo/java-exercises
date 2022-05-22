package com.exercises.array;

import java.util.ArrayList;

public class Exercise16 {

    /**
     * 16. Write a Java program to remove duplicate elements from an array.
     * */
    public static void main(String[] args) {

    }

    public static void delDuplicates(int[] array) {

        ArrayList<Integer> dups = getDuplicatesIdx(array);

        for(int i = 0; i < array.length; i++) {
            if (dups.contains(i)) array[i] = -1;
        }
    }

    public static ArrayList<Integer> getDuplicatesIdx(int[] array) {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for(int i = 0; i < array.length; i++) {
            int occurrences = 0;

            // check if the number appears more than 1x
            for(int n: array) {
                if (n == array[i]) occurrences++;
            }

            if (occurrences > 1) duplicates.add(i);
        }


        return duplicates;
    }
}
