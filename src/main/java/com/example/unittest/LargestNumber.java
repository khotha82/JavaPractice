package com.example.unittest;

/**
 * Created by krishna_hotha on 4/15/15.
 */
public class LargestNumber {


    /**
     * @param number
     * @return
     */
    public static int getLargestNumber(int[]number){

        if(number==null || number.length==0){
            throw new RuntimeException("Array is empty");

        }
        int max=number[0];

        for(int j:number){
            if(j>max){
                max=j;
            }
        }
        return max;
    }
}
