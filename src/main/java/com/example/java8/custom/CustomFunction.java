package com.example.java8.custom;

import java.util.function.Function;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class CustomFunction  {


    public static void main(String[] args) {

       Function<String,Integer>checkLength=(s)->s.length();
        System.out.println(checkLength.apply("krishna"));
    }
}
