package com.exercises.basics.part.two;

public class Exercise166 {
    /**
     * 166. Write a Java program to transform a given integer to String format.
     */
    public static void main(String[] args) {
        int n = 100;
        String result = transform(n);
        System.out.println(result);
    }

    public static String transform(int n) {
        boolean is_negative = false;
        StringBuilder tsb = new StringBuilder();

        if(n == 0) {
            return "0";
        } else if (n < 0){
            is_negative = true;
        }

        n = Math.abs(n);
        while(n > 0) {
            tsb.append(n % 10);
            n /= 10;
        }

        if(is_negative) {
            tsb.append("-");
        }

        return tsb.reverse().toString();
    }
}
