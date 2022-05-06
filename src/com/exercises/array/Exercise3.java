package com.exercises.array;

public class Exercise3 {

    /**
     * 3. Write a Java program to print the following grid.
     *
     * Expected Output :
     *
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * */
    public static void main(String[] args) {
        int [][] diagram = new int[2][10];

        for(int i = 0; i < diagram.length; i++){
            for(int j = 0; j < 10; j++) {
                System.out.printf("%2d ", diagram[i][j]);
            }
            System.out.println();
        }

    }


}
