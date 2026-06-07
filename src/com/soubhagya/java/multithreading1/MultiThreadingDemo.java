package com.soubhagya.java.multithreading1;

public class MultiThreadingDemo {
    static void main(String[] args) {
        long result=0;
        long startTime=System.currentTimeMillis();
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

        Thread thread3 = new Thread(Thread3::sayHello);
        thread3.start();
        System.out.println("Main class  thread :"+Thread.currentThread().getName());

    }
}
