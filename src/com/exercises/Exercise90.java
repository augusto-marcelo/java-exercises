package com.exercises;

public class Exercise90 {

    /**
     * 90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
     */
    public static void main(String[] args) {

        String[] envVars = {"PATH", "TEMP", "USERNAME"};

        for(String var: envVars) {
            System.out.println(var + "=" +  System.getenv().get(var));
        }

    }
}
