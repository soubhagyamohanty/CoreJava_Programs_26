package com.soubhagya.java.strings;

public class StringExample3 {
    static void main(String[] args) {
        String stringExample ="Soubhagya";
        String upperString = stringExample.toUpperCase();
        for(int i=0;i<upperString.length();i++){
            System.out.println(upperString.charAt(i));
        }
        System.out.println("------");
        for(char ch :upperString.toCharArray()){
            System.out.println(ch);
        }
    }
}
