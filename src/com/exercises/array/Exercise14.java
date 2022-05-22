package com.exercises.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise14 {

    /**
     * 14. Write a Java program to find the common elements between two arrays (string values).
     * */
    public static void main(String[] args) {

        String[] array1 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        String[] array2 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] common = getCommonValues(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Common values: " + Arrays.toString(common));
    }

    public static String[] getCommonValues(String[] first, String[] second) {
        String[] temp;

        // creating a temp array (with the size being the smaller)
        temp = first.length > second.length ? new String[first.length] : new String[second.length];

        int counter = 0;
        for(int i = 0; i < first.length; i++) {
            for(int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    temp[counter] = first[i];
                    counter++;
                }
            }
        }
        temp = shrink(temp);

        return temp;
    }

    public static String[] shrink(String[] array) {
        // define new size
        int size = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                size++;
            } else {
                break;
            }
        }

        String[] temp = new String[size];
        for(int i = 0; i < size; i++) {
            temp[i] = array[i];
        }

        return temp;
    }
}
