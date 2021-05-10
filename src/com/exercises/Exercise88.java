package com.exercises;

import java.util.Map;

public class Exercise88 {
    /**
     * 88. Write a Java program to get the current system environment and system properties.
     */
    public static void main(String[] args) {
        System.out.println("Current Sys environment variables: ");

        for(Map.Entry<String, String> envVar: System.getenv().entrySet()) {
            if(envVar.getKey().equals("PATH")) {
                System.out.println("PATH: ");
                for(String path: envVar.getValue().split(":")) {
                    System.out.println("\t" + path);
                }
            } else {
                System.out.println(envVar);
            }
        }

        System.out.println("\n\n***********************************\n\n");
        System.out.println("System Properties");

        for(Map.Entry<Object, Object> sysProp: System.getProperties().entrySet()) {
            if(sysProp.getKey().equals("java.class.path")){
                System.out.println("java.class.path=");
                for(String path: String.valueOf(sysProp.getValue()).split(":")) {
                    System.out.println("\t" + path);
                }
            } else {
                System.out.println(sysProp);
            }
        }
    }


}
