package com.exercises;

import java.io.File;

public class Exercise45 {

    /**
     * 45. Write a Java program to find the size of a specified file.
     * Sample Output:
     *
     * /home/students/abc.txt  : 0 bytes
     * /home/students/test.txt : 0 bytes
     */
    public static void main(String[] args) {
        File f = new File("/home/marcelo/brute_force_passwd.txt");
        System.out.println(f.length());
    }
}
