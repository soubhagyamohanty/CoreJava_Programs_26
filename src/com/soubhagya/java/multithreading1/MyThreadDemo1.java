package com.soubhagya.java.multithreading1;

public class MyThreadDemo1 {
    static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        long result=0;
        int chunk = Integer.MAX_VALUE / 4;

        MyThread thread1 = new MyThread(0, chunk);
        MyThread thread2 = new MyThread(chunk + 1, 2 * chunk);
        MyThread thread3 = new MyThread(2 * chunk + 1, 3 * chunk);
        MyThread thread4 = new MyThread(3 * chunk + 1, Integer.MAX_VALUE);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
         result = thread1.getResult()+thread2.getResult()
                 +thread3.getResult()+thread4.getResult();
        System.out.println("result="+result);
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken: "+(endTime-startTime)+"ms");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
    }
