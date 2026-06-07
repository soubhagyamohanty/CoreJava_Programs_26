package com.soubhagya.java.basics;

import java.lang.reflect.Method;

public class PrintObjectClassMethod {
    public static void main(String[] args) {
        PrintObjectClassMethod  p = new PrintObjectClassMethod();
        Method[] methods = p.getClass().getSuperclass().getDeclaredMethods();
        System.out.println("Total methods count: "+ methods.length );
        for (Method method : methods) {
            //System.out.println(method.getName());
            //System.out.println("----");
            System.out.println(method);
        }
    }
}
