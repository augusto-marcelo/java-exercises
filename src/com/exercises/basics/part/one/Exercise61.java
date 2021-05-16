package com.exercises.basics.part.one;

public class Exercise61 {

    /**
     * 61. Write a Java program to reverse a word.
     * Sample Output:
     *
     * Input a word: dsaf
     * Reverse word: fasd
     */
    public static void main(String[] args) {

        String original = "dsaf";
        String reversed = "";

        char[] originalSplited = original.toCharArray();

        for(int i = originalSplited.length - 1; i >= 0; i--) {
            reversed += originalSplited[i];
        }

        System.out.println("Origial = " + original);
        System.out.println("Reversed = " + reversed);

    }
}
