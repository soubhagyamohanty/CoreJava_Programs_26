package com.soubhagya.java.strings;

import java.util.stream.Collectors;

public class SubStringDemo {
    static void main(String[] args) {
        String originalString ="Soubhagya Sampanna Mohanty";
        String output =originalString.chars()
                .limit(9)
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(output);

    }
}
