package com.example.java8.functions;

/**
 * Created by krishna_hotha on 8/10/15 2015.
 */
public class TestPrintTest {

    public static void print(PrintTest p){

        System.out.println(p);
    }

    public static void main(String[] args) {

        PrintTest pt=(a)->{
            System.out.println("hello");
        };
    }
}
