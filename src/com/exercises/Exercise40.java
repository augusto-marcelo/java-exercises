package com.exercises;

import sun.nio.cs.ext.Big5;
import sun.nio.cs.ext.Big5_HKSCS;

import java.nio.charset.Charset;

public class Exercise40 {

    /**
     * 40. Write a Java program to list the available character sets in charset objects. Go to the editor
     * Expected Output
     *
     * List of available character sets:
     * Big5
     * Big5-HKSCS
     * CESU-8
     * EUC-JP
     * EUC-KR
     * GB18030
     * GB2312
     * GBK
     */
    public static void main(String[] args) {

        for(String charset: Charset.availableCharsets().keySet()) {
            System.out.println(charset);
        }
    }
}
