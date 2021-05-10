package com.exercises;

public class Exercise67 {

    /**
     * 67. Write a Java program to insert a word in the middle of the another string.
     *
     * Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
     * Sample Output:
     *
     * Python Tutorial 3.0
     */
    public static void main(String[] args) {
        String strToInject = "Python 3.0";

        int strLength = strToInject.length();

        String injected = strToInject.replaceFirst(" ", " Tutorial ");

        System.out.println("Original: " + strToInject);
        System.out.println("Injected: " + injected);
    }
}
