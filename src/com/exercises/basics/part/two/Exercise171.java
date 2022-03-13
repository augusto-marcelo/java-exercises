package com.exercises.basics.part.two;

public class Exercise171 {
    /**
     * 171. Write a Java program to accept two string and test if the second string
     * contains the first one.
     *
     * Input first string: Once in a blue moon
     * Input second string: See eye to eye
     * If the second string contains the first one? false
     */
    public static void main(String[] args) {

        String strOne = "Once in a blue moon";
        String strTwo = "See eye to eye";
        boolean result = contains(strOne, strTwo);

        System.out.println("S1 = " + strOne);
        System.out.println("S2 = " + strTwo);
        System.out.println("R = " + result);

    }

    public static boolean contains(String strOne, String strTwo) {
        return strTwo.contains(strOne);
    }
}
