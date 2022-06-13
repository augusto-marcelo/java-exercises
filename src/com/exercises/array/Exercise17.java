package com.exercises.array;

import javafx.stage.Stage;

import java.util.*;

public class Exercise17 {

    /**
     * Reverse a given Phrase keeping the punctuation order.
     * */
    public static void main(String[] args) {

        String phrase = "Hello, asdf asdf World!";
        System.out.println("Phrase=" + phrase);

        char[] punctuation = {' ', ',', '.', '!','?'};

        // fila contendo ordem da pontuação
        Queue<Character> order = new LinkedList<Character>();

        // preeche a fila
        for(char c: phrase.toCharArray()) {
            if(containsChar(punctuation, c)) order.add(c);
        }


        System.out.println("...");

        // testando a sequencia de fila
        int counter = order.size();
        for(int i = 0; i < counter; i++) {
            Character c = order.remove();
            if(c == ' ') {
                System.out.println("BLANK SPACE");
            } else {
                System.out.println(c);
            }

        }

        System.out.println("...");

        // deve separar as palavras obdecendo sua sequência e ignorar os caracteres de pontuação
        List<Character> splitedText = splitText(phrase);

        System.out.println("Text splited: " + splitedText.toString());

        System.out.println("...");
        for(char c: splitedText) {
            System.out.println(String.valueOf(c));
        }

    }

    public static List<Character> splitText(String phrase) {

        char[] punctuation = {' ', ',', '.', '!','?'};

        List<Character> words = new ArrayList<Character>();

        List<Character> temp = new ArrayList<Character>();

        for(char c: phrase.toCharArray()) {
            if (containsChar(punctuation, c) && temp.size() > 0) {
                //words.add(temp);
                temp.clear();
            } else if (!containsChar(punctuation, c)) {
                temp.add(c);
            }
        }

        return words;
    }

    public static boolean containsChar(char[] array, char element) {

        for(char c: array) {
            if (c == element) return true;
        }

        return false;
    }

}
