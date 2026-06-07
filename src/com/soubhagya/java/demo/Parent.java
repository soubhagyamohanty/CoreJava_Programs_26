package com.soubhagya.java.demo;

public class Parent {
    public void m1(int a, int b){
        System.out.println("Parent m1() method");
    }
    public void m1(int a, float b){
        System.out.println("Parent m2() method");
    }

    static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1(1, 2);
        p1.m1(5,1.5f);
        p1.m1('c',1);
        p1.m1(1,1L);
        p1.m1(1,1.5f);
        p1.m1('c',1);
        System.out.println("for git hub changes ");
    }
}
