package com.exercises.basics.part.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise64 {

    /**
     * 64. Write a Java program that accepts two integer values between 25 to 75
     * and return true if there is a common digit in both numbers.
     * Sample Output:
     *
     * Input the first number : 35
     * Input the second number: 45
     * Result: true
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.printf("Input the first number: ");
        String firstNumber = "35"; // sc.nextLine();

        //System.out.printf("Input the first number: ");
        String secondNumber = "45"; //sc.nextLine();

        ArrayList<Character> result = haveCommon(firstNumber, secondNumber);

        System.out.println("Result: " + result);
        System.out.println("Result: " + solution(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber)));

    }

    public static ArrayList<Character> haveCommon(String firstNumber, String secondNumber) {

        char[] firstNumberSplit = firstNumber.toCharArray();
        char[] secondNumberSplit = secondNumber.toCharArray();

        ArrayList<Character> commons = new ArrayList<>();

        for(int i = 0; i < firstNumberSplit.length; i++) {
            for(int j = 0; j < secondNumberSplit.length; j++) {
                if(firstNumberSplit[i] == secondNumberSplit[j]) {
                    if(!commons.contains(firstNumberSplit[i])) {
                        commons.add(firstNumberSplit[i]);
                    }
                }
            }
        }

        return commons;
    }

    public static boolean solution(int first, int second) {
        if ((first >= 25 && first <= 75) && (second >= 25 && second <= 75)) {
            int firstOnesHouse = first % 10;
            int firstTensHouse = first / 10;

            int secondOnesHouse = second % 10;
            int secondTensHouse = second / 10;

            return (firstOnesHouse == secondOnesHouse || firstOnesHouse == secondTensHouse || firstTensHouse == secondTensHouse || firstTensHouse == secondOnesHouse);
        }

        return false;
    }
}
