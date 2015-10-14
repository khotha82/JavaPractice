package com.example.effjava.chapter1;

import java.util.function.Function;

/**
 * Created by krishna_hotha on 10/6/15 2015.
 */
public class TestFunction {


     static class FunCheck implements Function<String,String>{

         @Override
         public String apply(String s) {
             return "Hello"+s;
         }
     }

    public static void main(String[] args) {

        TestFunction.FunCheck f=new TestFunction.FunCheck();
        System.out.println(f.apply("hotha"));
    }
}
