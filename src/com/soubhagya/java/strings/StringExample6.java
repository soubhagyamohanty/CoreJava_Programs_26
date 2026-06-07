package com.soubhagya.java.strings;

public class StringExample6 {
    static void main(String[] args) {
        String originalString="Soubhagya Sampanna Mohanty!";
        int s = originalString.indexOf("Sam");
        boolean  isAvailable = originalString.contains("Sampanna");
        boolean isResult = originalString.startsWith("soubhagya");
        boolean isMatches = originalString.matches(".*Sampanna.*");
        /*System.out.println(s);
        System.out.println(isAvailable);*/

        String java1 ="\n\t\b\r\t\r\r Java      \r\r\r\r\n".trim();
        System.out.println(java1);
    }
}
