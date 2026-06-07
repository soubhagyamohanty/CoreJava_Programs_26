package com.soubhagya.java.arraylist;

import java.lang.reflect.Method;

public class Test {
    static void main(String[] args) {
        //Method[] method = Object.class.getDeclaredMethods();
        for(Method m: Object.class.getDeclaredMethods()){
            System.out.println(m.getName());
            //System.out.println(m.getName());
        }
    }
}
