package com.example.java8.puzzles;

/**
 * Created by krishna_hotha on 5/3/15 2015.
 */
public class Fibnoc {


    public int fib(int n){



        if(n==0 || n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);


    }

    public static void main(String[] args) {

        Fibnoc fibnoc=new Fibnoc();
        System.out.println(fibnoc.fib(10));
    }

}
