package com.soubhagya.java.multithreading1;

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1 class which extends  Thread Class :"+
                Thread.currentThread().getName());
    }
}
