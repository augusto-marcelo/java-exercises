package com.exercises.basics.part.one;

public class Exercise118 {
    /**
     * 118. Write a Java program to get the first
     * occurrence (Position starts from 0.) of a string within a given string.
     */
    public static void main(String[] args) {

        String text = "asdfqwer";
        String pattern = "qwer";
        int index = firstMatchIndex(text, pattern);

        System.out.println("Original: " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("first index: " + index);
    }

    public static int firstMatchIndex(String text, String pattern) {
        for(int i = 0; i <= (text.length() - pattern.length()); i++) {
            if(text.substring(i, i + pattern.length()).equals(pattern)) {
                return i;
            }
        }

        return -1;
    }
}
