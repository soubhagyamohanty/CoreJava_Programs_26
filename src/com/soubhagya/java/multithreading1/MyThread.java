package com.soubhagya.java.multithreading1;

public class MyThread extends Thread {
    private int startIndex;
    private int endIndex;
    private long result;

    public MyThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
    @Override
    public void run() {
        for(long i=startIndex;i<=endIndex;i++){
            result += i;
        }
    }
    public long getResult() {
        return result;
    }
}
