package com.exercises;

public class Exercise4 {

    /*
     Write a Java program to print the result of the following operations. Go to the editor
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13
     */
    public static void main(String[] args) {

        System.out.println("Operation a) -5 + 8 * 6 = " + Integer.toString(-5 + 8 * 6));
        System.out.println("Operation b) (55+9) % 9 = " + Integer.toString((55+9) % 9));
        System.out.println("Operation c) 20 + -3*5 / 8 = " + Double.toString(20 + -3*5 / 8));
        System.out.println("Operation d) 5 + 15 / 3 * 2 - 8 % 3 = " + Integer.toString(5 + 15 / 3 * 2 - 8 % 3));
    }
}
