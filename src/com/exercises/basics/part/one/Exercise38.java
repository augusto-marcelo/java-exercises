package com.exercises.basics.part.one;

public class Exercise38 {

    /**
     * 38. Write a Java program to count the letters, spaces, numbers and other characters
     * of an input string.
     *
     * Expected Output
     *
     * The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
     * letter: 23
     * space: 9
     * number: 10
     * other: 6
     */

    public static void main(String[] args) {
        String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        counter(text);
    }

    public static void counter(String text) {
        Integer letters = 0;
        Integer spaces = 0;
        Integer numbers = 0;
        Integer others = 0;

        for (Character chr: text.toCharArray()) {
            if (Character.isAlphabetic(chr)){
                letters++;
            } else if (Character.isDigit(chr)) {
                numbers ++;
            } else if (Character.isSpaceChar(chr)) {
                spaces ++;
            } else {
                others ++;
            }
        }

        System.out.println("The String is: " + text);
        System.out.println("Letters = " + letters);
        System.out.println("Spaces = " + spaces);
        System.out.println("Numbers = " + numbers);
        System.out.println("Others = " + others);
    }
}
