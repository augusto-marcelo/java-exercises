package com.exercises;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;

public class Exercise87 {

    /**
     * 87. Write a Java program than read an integer and
     * calculate the sum of its digits and write the number of each digit of the sum in English.
     */
    public static void main(String[] args) {

        int testData = 34;
        int result = calculateSumOfDigits(testData);
        ArrayList<String> numbers = fullNameList(testData);

        System.out.println("Input: " + testData);
        for(int i = 0; i < numbers.size(); i ++) {
            if(i < numbers.size() - 1) {
                System.out.print(numbers.get(i));
                System.out.print(" + ");
            } else {
                System.out.print(numbers.get(i) + " = ");
            }
        }

        System.out.print(result);


    }

    public static int calculateSumOfDigits(int num) {

        String numInText = Integer.toString(num);
        int total = 0;

        for(char i:  numInText.toCharArray()) {
            total += Integer.parseInt(String.valueOf(i));
        }

        return total;
    }

    public static ArrayList<String> fullNameList(int num) {
        ArrayList<String> full = new ArrayList<>();

        for(char i: Integer.toString(num).toCharArray()) {
            full.add(
                    numberInFull(
                            Integer.parseInt(String.valueOf(i))
                    )
            );
        }

        return full;
    }

    public static String numberInFull(int n) {
        String[] fullName = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        return fullName[n - 1];
    }
}
