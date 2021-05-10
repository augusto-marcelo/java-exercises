package com.exercises;

public class Exercise68 {

    /**
     * 68. Write a Java program to create a new string of 4 copies
     * of the last 3 characters of the original string.
     * The length of the original string must be 3 and above. Go to the editor
     * Sample Output:
     *
     * 3.03.03.03.0
     */
    public static void main(String[] args) {

        String originalString = "1234563.0";
        String fourCopies = getFourCopies(originalString);

        System.out.println("Original: " + originalString);
        System.out.println("Four copies of last three chars: " + fourCopies);

        System.out.println(getFourCopies("23"));
    }

    public static String getFourCopies(String str) {
        if(str.length() <= 3) {
            return "String must be larger";
        }


        String lastThreeChars = str.substring(str.length() - 3);
        String result = "";

        for(int i = 0; i < 4; i++) {
            result += lastThreeChars;
        }

        return result;
    }

}
