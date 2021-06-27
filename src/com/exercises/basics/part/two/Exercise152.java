package com.exercises.basics.part.two;

import java.util.Scanner;

public class Exercise152 {
    /**
     * 152. Write a Java program that accepts four integer
     * from the user and prints equal if all four are equal, and not equal otherwise.
     *
     * Sample Output:
     * Input first number: 25
     * Input second number: 37
     * Input third number: 45
     * Input fourth number: 23
     * Numbers are not equal!
     */
    public static void main(String[] args) {
        int[] userNumbers = new int[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < userNumbers.length; i++) {
            System.out.printf("Input integer %d: ", i + 1);
            int input = sc.nextInt();
            userNumbers[i] = input;
        }

        boolean theSame = isTheSame(userNumbers);

        if(theSame) {
            System.out.printf("Numbers are ALL equals!");
        } else {
            System.out.println("Number are NOT equals!");
        }
    }

    public static boolean isTheSame(int[] numbers) {
        for(int num: numbers) {
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] != num) {
                    return false;
                }
            }
        }

        return true;
    }
}
