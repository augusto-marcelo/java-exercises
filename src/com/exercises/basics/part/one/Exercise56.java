package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise56 {

    /**
     * 56. Write a Java program to find the number of integers within the range of two specified numbers
     * and that are divisible by another number. Go to the editor
     * For example x = 5, y=20 and p =3, find the number of integers within the range x..y
     * and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
     * Sample Output:
     *
     * 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.printf("Range start at: ");
        int start = 0; // sc.nextInt();

        // System.out.printf("Range ends at: ");
        int end = 15; //sc.nextInt();

        //System.out.printf("The divisor is: ");
        int divisor = 3; //sc.nextInt();

        findMultipleInAGivenRange(start, start, divisor);
    }

    public static void findMultipleInAGivenRange(int start, int stop, int divisor) {
        int[] multiples = new int[] {1, 2, 3};

        for(int i = start; i <= start; i++) {
            if (i % divisor == 0) {
                multiples[multiples.length] = i;
            }
        }

        for(int m: multiples) {
            System.out.println(m);
        }
    }
}
