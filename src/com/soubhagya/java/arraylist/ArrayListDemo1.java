package com.soubhagya.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo1 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Mango");
        list.add("Dragonfruits");
        list.add("Apple");
        list.add("Ski");
        list.add("Peab");
        list.add("Ap");
        list.add("Ep");
        list.add("Ip");
        list.add("Op");
        list.add("Uaaaaaaaaaaaaaaaakkkkakakkkak");
        System.out.println(list);
        //list.sort(Collections.reverseOrder());
        //Collections.sort(list.reversed());
        //list.sort(Comparator.naturalOrder());
       // list.sort(Comparator.reverseOrder());
        //list.sort(new LastCharCustomComparator());
        //Collections.sort(list,new LastCharCustomComparator().reversed());
        Collections.sort(list,new LastCharCustomComparator().reversed());
        Collections.sort(list,new LastCharCustomComparator());
        System.out.println(list);



    }
}
