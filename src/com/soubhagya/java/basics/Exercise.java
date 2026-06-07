package com.soubhagya.java.basics;

import java.util.*;
public class Exercise {
    public static void main(String[] args){
        String[] sounds = storeStringsInArray();
        System.out.println(sounds.length);
        System.out.println(Arrays.toString(sounds));

    }

    public static String[] storeStringsInArray() {

        return new String[]{"Woof!", "Meow!", "Quack!"};

    }

}
