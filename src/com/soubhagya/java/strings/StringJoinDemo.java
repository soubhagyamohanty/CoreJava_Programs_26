package com.soubhagya.java.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringJoinDemo {
    static void main(String[] args) {
        String s1= String.join(":","Soubhagya","Sampanna","Mohanty");
        List<String> list = Collections.emptyList();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Pineapple");
        String s2= String.join(":",list1);
        System.out.println(s1);
        System.out.println(s2);
    }
}
