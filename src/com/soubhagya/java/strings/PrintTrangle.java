package com.soubhagya.java.strings;

public class PrintTrangle {
    static void main(String[] args) {
        int index =10;
        for(int i=0;i<index;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
