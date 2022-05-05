package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise10 {

    /**
     * 10. Write a Java program to break an integer into a sequence of individual digits.
     *
     * Test Data
     * Input six non-negative digits: 123456
     * Expected Output :
     * 1 2 3 4 5 6
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        String userInput = sc.nextLine();

        for(Character c : userInput.toCharArray()) {
            System.out.print(c.toString() + " ");
        }

    }
}
