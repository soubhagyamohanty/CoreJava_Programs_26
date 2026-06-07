package com.soubhagya.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayLIstIterationDemo {
    static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");
        System.out.println("Original list: " + arrayList);
        System.out.println("for loop approach----");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("for-each loop approach----");
        for(String uniqueElement:arrayList){
            System.out.println(uniqueElement.toLowerCase());
        }
        System.out.println("Iterator----");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("stringListIterator----");
        ListIterator<String> stringListIterator = arrayList.listIterator();
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
        System.out.println("stringListIterator1 previous----");
        ListIterator<String> stringListIterator1 = arrayList.listIterator(arrayList.size());
        while (stringListIterator1.hasPrevious() ){
            System.out.println(stringListIterator1.previous());
        }
    }
}
