package com.soubhagya.java.basics;

import java.lang.reflect.Method;

public class Test {
    static void main(String[] args) {
        System.out.println(Object.class.getDeclaredMethods().length);
        for (Method method: Object.class.getDeclaredMethods()) {
            System.out.println(method.getName());
            System.out.println("commit changes on github online part2");

        }
    }
}
