package com.exercises.conditionalstatements;

import java.util.Scanner;

public class Exercise3 {
    /**
     * 3. Take three numbers from the user and print the greatest number.
     *
     * Test Data
     * Input the 1st number: 25
     * Input the 2nd number: 78
     * Input the 3rd number: 87
     * Expected Output :
     * The greatest: 87
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int firstNum = sc.nextInt();

        System.out.print("Input the 2nd number: ");
        int secondNum = sc.nextInt();

        System.out.print("Input the 3rd number: ");
        int thirdNum = sc.nextInt();

        int result = getGreatest(firstNum, secondNum, thirdNum);
        System.out.printf("The greatest: %S", result);


    }

    public static int getGreatest(int a, int b, int c) {
        if(a > b && b < c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
