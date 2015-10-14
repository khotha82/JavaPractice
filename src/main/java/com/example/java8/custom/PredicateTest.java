package com.example.java8.custom;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class PredicateTest {


    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        conditaion(list,(n)->n%2==0);
    }

    public static void conditaion(List<Integer>list,Predicate<Integer>predicate){

        for(Integer n:list){
            if(predicate.test(n)){
                System.out.println(n);
            }
        }
    }
}
