package com.soubhagya.java.basics;

public class TwoSumProblem {
    static void main(String[] args) {
        int[] nums = {2, 4,5,7,9, 11, 15};
        int target = 9;
        boolean found = false;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    //System.out.println(nums[i]+" "+nums[j]);
                    System.out.println(i+" --"+j);
                    found = true;
                }
            }
            if(found == true){
                break;
            }

        }
        if(!found){
            System.out.println("Pair not found");
        }
    }
}
