package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        // STATUS = DONE
        /*
        7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80
         */

        final Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            Integer result = userInput * i;
            System.out.println(result.toString());
        }

    }
}
