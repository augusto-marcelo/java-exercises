package com.exercises;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise42 {

    /**
     * 42. Write a Java program to input and display your password. Go to the editor
     * Expected Output
     *
     * Input your Password:
     * Your password was: abc@123
     */
    public static void main(String[] args) {

        //System.out.println("asdf");

        Console cons;
        if((cons = System.console()) != null) {
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Input your password: ");
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if(pass_ward != null) {
                    Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get password... no console");
        }
    }
}
