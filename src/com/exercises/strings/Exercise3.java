package com.exercises.strings;

public class Exercise3 {

    /**
     * 3. Write a Java program to get the character (Unicode code point) before the
     * specified index within the String
     *
     * Original String : w3resource.com
     * Character(unicode point) = 119
     * Character(unicode point) = 99
     */
    public static void main(String[] args) {
        String txt = "w3resource.com";
        System.out.println("Original String" + txt);

        int unicodeIndex = 1;
        int codePointBefore = txt.codePointBefore(unicodeIndex);

        System.out.println("Character(unicode point) = " + codePointBefore);
    }
}
