package com.soubhagya.java.multithreading1;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread2 class which implemets Runnable interface"+
                Thread.currentThread().getName());
    }
}
