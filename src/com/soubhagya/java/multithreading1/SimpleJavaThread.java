package com.soubhagya.java.multithreading1;

public class SimpleJavaThread {
    static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        long result =0;
        for(long i=0;i<=Integer.MAX_VALUE;i++){
            result += i;
        }
        System.out.println(result);
        long endTime=System.currentTimeMillis();
        System.out.println("Total time: " + (endTime-startTime)+"ms");
    }

}
