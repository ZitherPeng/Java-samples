package com.lc.jsc.datatypes;

public class CharType {
    /**
     * 1 Byte, 16 bit unicode character, \u0000 - \uFFFF (0-65535) ,default \u0000
     */
    char fooChar = 'a';


    public static void main(String[] args) {
        char barChar = 'b';
        System.out.println(Character.SIZE);
    }
}
