package com.exercises.datatypes;

public class Exercise15 {

    /**
     * 15. Write a Java program to get the next floating-point adjacent in the
     * direction of positive and negative infinity from a given float/double number.
     */
    public static void main(String[] args) {

        float initialFloat = 0.5f;
        float nextFloatUp = Math.nextUp(initialFloat);
        float nextFloatDown = Math.nextDown(initialFloat);

        System.out.println("Float: " + initialFloat + " | Next Up: " + nextFloatUp + " | Next Down: " + nextFloatDown);

        double initialDouble = 0.10d;
        double nextDoubleUp = Math.nextUp(initialDouble);
        double nextDoubleDown = Math.nextDown(initialDouble);

        System.out.println("Double: " + initialDouble + " | Next Up: " + nextDoubleUp + " | Next Down: " + nextDoubleDown);
    }
}
