package com.soubhagya.java.multithreading1;

public class SumOfIntNumbersMulti extends Thread {
    private int startIndex;
    private int  endIndex;
    private long result;

    SumOfIntNumbersMulti(int startIndex, int endIndex){
    this.startIndex = startIndex;
    this.endIndex = endIndex;
    }
    @Override
    public void run() {
         result = 0;
        for(long i=startIndex;i<=endIndex;i++){
            result += i;
        }
}
public long getResult() {
          return result;
      }


}
