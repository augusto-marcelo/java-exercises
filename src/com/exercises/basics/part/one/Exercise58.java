package com.exercises.basics.part.one;

import java.util.Locale;

public class Exercise58 {

    /**
     * 58. Write a Java program to capitalize the first letter of each word in a sentence.
     * Sample Output:
     *
     * Input a Sentence: the quick brown fox jumps over the lazy dog.
     * The Quick Brown Fox Jumps Over The Lazy Dog.
     */
    public static void main(String[] args) {

        String sentence = "the quick brown fox jumps over the lazy dog.";
        String[] sentenceSplited = sentence.split(" ");
        String newSentence = "";

        
        for(String word: sentenceSplited) {
           newSentence += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
           newSentence += " ";
        }

        System.out.println("Old sentence: " + sentence);
        System.out.println("New sentence: " + newSentence);
    }
}
