package com.soubhagya.java.strings;

import java.util.Arrays;

public class StringExample1 {
    static void main(String[] args) {
        String[] stringArray = {"Soubhagya","Priyanka","John","Doe"};
        String string = "Java is Easy";
       /* System.out.println(stringArray);
        System.out.println(Arrays.toString(stringArray));*/
        //Arrays.stream(stringArray).forEach(System.out::println);
        //System.out.println(string);
//Arrays.stream(string.split("")).forEach(System.out::println);

        for (String word:stringArray) {
            System.out.println(word);
        }
        for(int i=0; i<stringArray.length;i++) {
            System.out.println(stringArray[i]);
        }


    }
}
