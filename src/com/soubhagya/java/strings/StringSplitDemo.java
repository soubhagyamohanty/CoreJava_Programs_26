package com.soubhagya.java.strings;

public class StringSplitDemo {
    static void main(String[] args) {
        String s="Soubhagya-Sampanna-Mohanty";
        String[] split = s.split("-");
        for (String string : split) {
            System.out.println(string);

        }

    }
}
