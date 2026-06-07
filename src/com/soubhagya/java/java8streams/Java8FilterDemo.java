package com.soubhagya.java.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FilterDemo {
    static void main(String[] args) {
        List<String> nameList=Arrays.asList("Soubhagya", "Priyanka", "Deepak","Sipun","Depun","Sks","sps");
        List<String>  filterList =
                nameList.stream().filter(name -> name.toLowerCase().startsWith("s")).collect(Collectors.toList());
        System.out.println(filterList);
                nameList.stream().filter(name -> name.toLowerCase().startsWith("s")).collect(Collectors.toList())
                        .forEach(System.out::println);

        List<String> list1 = nameList.stream().filter(name -> name.toLowerCase().startsWith("s")
                && name.toLowerCase().endsWith("a")).toList();
        System.out.println(list1);

        List<String> soubhagyaList =
                nameList.stream().filter(n -> n.equalsIgnoreCase("soubhagya"))
                        .collect(Collectors.toList());
        System.out.println("soubhagyaList"+soubhagyaList);

    }
}
