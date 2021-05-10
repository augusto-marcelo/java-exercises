package com.exercises;

import java.util.Scanner;

public class Exercise70 {

    /**
     * 70. Write a Java program to create a string in the form
     * short_string + long_string + short_string from two strings.
     *
     * The strings must not have the same length.
     * Test Data:
     * Str1 = Python
     * Str2 = Tutorial
     *
     * Sample Output:
     *
     * PythonTutorialPython
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Str1: ");
        String strOne = "Python"; //sc.nextLine();

        System.out.printf("Str2: ");
        String strTwo = "Tutorial"; // sc.nextLine();

        String result = transform(strOne, strTwo);
        System.out.println(result);
    }

    public static String transform(String one, String two) {
        String longer = one.length() > two.length() ? one: two;
        String shorter = two.length() < one.length() ? two: one;

        return shorter + longer + shorter;
    }
}
