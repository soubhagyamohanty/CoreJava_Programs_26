package com.soubhagya.java.methodoverriding;

public class Test {
    static void main(String[] args) {
        Parent p = new Parent();
       /* p.property();
        p.marry();*/
        Parent p2 = new Child();
       // p2.property();
        p2.marry();
        Child c = new Child();
       /* c.property();
        c.marry();*/

    }
}
