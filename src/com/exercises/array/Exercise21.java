package com.exercises.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise21 {
    /**
     * 21. Write a Java program to convert an ArrayList to an array.
     * */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int[] primitiveArray = convertToPrimitiveArray(numbers);

        System.out.println(Arrays.toString(primitiveArray));
    }

    public static int[] convertToPrimitiveArray(ArrayList<Integer> list) {
        int size = list.size();
        int[] primitiveArray = new int[size];

        for(int i = 0; i < size; i++) {
            primitiveArray[i] = list.get(i);
        }

        return primitiveArray;
    }
}
