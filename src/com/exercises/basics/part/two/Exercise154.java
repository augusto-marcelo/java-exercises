package com.exercises.basics.part.two;

public class Exercise154 {
    /**
     * 154. Write a Java program to print the contents of a two-dimensional Boolean
     * array where t will represent true and f will represent false.
     *
     * Sample array:
     * array = {{true, false, true}, {false, true, false}};
     * Expected Output :
     * t f t
     * f t f
     */
    public static void main(String[] args) {
        boolean[][] boolArray = {{true, false, true}, {false, true, false}};
        printBools(boolArray);
    }

    public static void printBools(boolean[][] booleans) {
        for(boolean[] bArr: booleans) {
            for(boolean b: bArr) {
                if(b) {
                    System.out.print("t ");
                } else {
                    System.out.print("f ");
                }
            }
            System.out.println();
        }
    }
}
