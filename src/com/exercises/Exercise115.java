package com.exercises;

public class Exercise115 {
    /**
     * 115. Write a Java program to check if a positive number is a palindrome or not.
     *
     * Input a positive integer: 151
     * Is 151 is a palindrome number?
     * true
     */
    public static void main(String[] args) {
        int num = 1234321;

        System.out.printf("Is %d a palindrome number?\n", num);
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if(str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
