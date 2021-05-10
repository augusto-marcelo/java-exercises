package com.exercises;

import java.util.Scanner;

public class Exercise71 {
    /**
     * 71. Write a Java program to create the concatenation of the two strings
     * except removing the first character of each string.
     *
     * The length of the strings must be 1 and above.
     * Test Data: Str1 = Python
     * Str2 = Tutorial
     * Sample Output:
     *
     * ythonutorial
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Str1: ");
        String firstString = sc.nextLine();

        System.out.printf("Str2: ");
        String secondString = sc.nextLine();

        System.out.printf(concat(firstString, secondString));

    }

    public static String concat(String one, String two) {
        String result = one.substring(1) + two.substring(1);

        return result;

    }
}
