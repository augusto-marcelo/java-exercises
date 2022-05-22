package com.exercises.strings;

public class Exercise2 {
    /**
     * 2. Write a Java program to get the character (Unicode code point) at the given index within the String.
     *
     * Original String : w3resource.com
     * Character(unicode point) = 51
     * Character(unicode point) = 101
     */
    public static void main(String[] args) {

        String txt = "w3resource.com";
        System.out.println("Original String" + txt);

        char[] txtArray = txt.toCharArray();

        for(int i = 0; i < txtArray.length; i++) {
            int unicodePoint = Character.toString(txtArray[i]).codePointAt(0);
            System.out.println(("Index = " + i + " | Char = "+ txtArray[i] + " | Unicode point = " + (int)txtArray[i]));
            //System.out.println("Index = " + i + " | Char = " + txtArray[i] + " | Unicode point = " + unicodePoint);
        }

    }


}
