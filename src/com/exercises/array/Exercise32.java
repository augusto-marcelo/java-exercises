package com.exercises.array;

import java.util.Arrays;

public class Exercise32 {
    /**
     * 32. Write a Java program to check if an array of integers contains two specified elements 65 and 77
     * */
    public static void main(String[] args) {
        int[] magicNums = {65, 77};
        int[] array = {10, 20, 65, 7};
        boolean contains = containsMagicNums(array, magicNums);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Magic nums: " + Arrays.toString(magicNums));
        System.out.println("Contains? " + contains);


    }

    public static boolean containsMagicNums(int[] array, int[] magicNums) {

        boolean check = false;

        for(int i = 0; i < magicNums.length; i++) {
            if(i > 0 && check == false) {
                return false;
            }

            for(int j = 0; j < array.length; j++) {
                if(magicNums[i] == array[j]) {
                    check = true;
                }
            }
        }

        return check;
    }
}
