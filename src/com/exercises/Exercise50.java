package com.exercises;

import java.util.ArrayList;

public class Exercise50 {

    /**
     * 50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
     * Sample Output:
     *
     * Divided by 3:
     * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
     * , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
     *
     * Divided by 5:
     * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
     * 95,
     *
     * Divided by 3 & 5:
     * 15, 30, 45, 60, 75, 90,
     */
    public static void main(String[] args) {
        ArrayList<Integer> divisibleByThree = new ArrayList<Integer>();
        ArrayList<Integer> divisibleByFive = new ArrayList<Integer>();
        ArrayList<Integer> divisibleByThreeAndFive = new ArrayList<Integer>();

        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                divisibleByThree.add(i);
            }

            if(i % 5 == 0) {
                divisibleByFive.add(i);
            }

            if(i % 3 == 0 && i % 5 == 0) {
                divisibleByThreeAndFive.add(i);
            }
        }

        System.out.println("Divided by 3: ");
        System.out.println(divisibleByThree);

        System.out.println();

        System.out.println("Divided by 5: ");
        System.out.println(divisibleByFive);

        System.out.println();

        System.out.println("Divided by 3 & 5: ");
        System.out.println(divisibleByThreeAndFive);
    }
}
