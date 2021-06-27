package com.exercises.basics.part.two;

public class Exercise156 {
    /**
     * 156. Write a Java program that returns the largest
     * integer but not larger than the base-2 logarithm of a specified integer.
     *
     * Original Number: 2350
     * Result: 115
     */
    public static void main(String... args) {
        int original = 2350;
        int largest = getLargest(original);

        System.out.println(largest);
    }

    public static int getLargest(int num) {
        int log = (int) (Math.log(num) / Math.log(2));
        return log;
    }
}
