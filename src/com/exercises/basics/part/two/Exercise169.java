package com.exercises.basics.part.two;

public class Exercise169 {

    /**
     *169. Write a Java program to reverse the content of a sentence (assume a single space
     * between two words) without reverse every word.
     *
     * Input a string: The quick brown fox jumps over the lazy dog
     * Result: dog lazy the over jumps fox brown quick The
     */
    public static void main(String[] args) {
        String phrase = "The quick brown fox jumps over the lazy dog";
        String reverse = reverse(phrase);

        System.out.println("Original: " + phrase);
        System.out.println("Reversed: " + reverse);
    }

    public static String reverse(String phrase) {
        String temp = "";

        String[] phraseSplited = phrase.split(" ");

        for(int i = phraseSplited.length -1 ; i >= 0; i--) {
            temp += phraseSplited[i];
            temp += " ";
        }

        return temp;
    }

}
