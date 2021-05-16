package com.exercises.basics.part.one;

public class Exercise55 {

    /**
     * 55. Write a Java program to convert seconds to hour, minute and seconds.
     * Sample Output:
     *
     * Input seconds: 86399
     * 23:59:59
     */
    public static void main(String[] args) {

        int seconds = 86399;

        converToHour(seconds);
    }

    public static void converToHour(int seconds) {
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;

        hours = (seconds / 3600) % 24;
        remainingSeconds = seconds % 3600;
        minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;

        System.out.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);


    }
}
