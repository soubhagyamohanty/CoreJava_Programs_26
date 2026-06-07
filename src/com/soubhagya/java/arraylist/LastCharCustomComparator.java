package com.soubhagya.java.arraylist;

import java.util.Comparator;

public class LastCharCustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
       // int result =Integer.compare(o1.length(), o2.length());
        int result =Integer.compare(o2.length(), o1.length());
        if(result !=0){
            return result;
        }
        char lastchar1 =o1.charAt(o1.length()-2);
        char lastchar2 =o2.charAt(o2.length()-2);
        int comparision = Character.compare(lastchar1, lastchar2);
        return comparision;
    }
}

