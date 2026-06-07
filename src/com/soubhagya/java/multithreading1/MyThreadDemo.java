package com.soubhagya.java.multithreading1;

public class MyThreadDemo {
    static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        long result=0;
        MyThread thread1 = new MyThread(0,Integer.MAX_VALUE/2);
        MyThread thread2 =
                new MyThread((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
         result = thread1.getResult()+thread2.getResult();
        System.out.println("result="+result);
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken: "+(endTime-startTime)+"ms");
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
    }
