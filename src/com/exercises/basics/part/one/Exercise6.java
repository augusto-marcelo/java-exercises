package com.exercises.basics.part.one;

public class Exercise6 {

    // STATUS = DONE
    /*
    Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
     */
    public static void main(String[] args) {

        Integer sumResult = 125 + 24;
        Integer subResult = 125 - 24;
        Integer multiplyResult = 125 * 24;
        Integer divisionResult = 125 / 24;
        Integer modResult = 125 % 4;

        System.out.println("Sum Result = " + sumResult.toString());
        System.out.println("Sub Result = " + subResult.toString());
        System.out.println("Multiply Result = " + multiplyResult.toString());
        System.out.println("Division Result = " + divisionResult.toString());
        System.out.println("Modulus Result = " + modResult.toString());

    }
}
