package com.exercises.array;

import java.util.ArrayList;

public class Exercise20 {

    /**
     * 20. Write a Java program to convert an array to ArrayList.
     * */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        ArrayList<Integer> list = convertToArrayList(numbers);

        System.out.println(list);
    }

    public static ArrayList<Integer> convertToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n: array) {
            list.add(n);
        }

        return list;
    }
}
