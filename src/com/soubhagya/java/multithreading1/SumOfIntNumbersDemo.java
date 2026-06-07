package com.soubhagya.java.multithreading1;

public class SumOfIntNumbersDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        long result = 0;
        SumOfIntNumbersMulti t1 = new SumOfIntNumbersMulti(0,Integer.MAX_VALUE/2);
        SumOfIntNumbersMulti t2 =
                new SumOfIntNumbersMulti((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        result = t1.getResult()+ t2.getResult();
        System.out.println("result is "+result);
        long endTime =System.currentTimeMillis();
        System.out.println("Total execution time is "+(endTime-startTime)+"ms");
    }

}
