package com.soubhagya.java.java8streams;

public class StringSplitDemo {
    static void main(String[] args) {
        String string ="Soubhagya Sampanna Mohanty";
        String[]  splitOfWords = string.split(" ");
        for (String word : splitOfWords) {
            System.out.println(word);
        }

    }
}
