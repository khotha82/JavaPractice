package com.example.java8.functions;

import java.util.function.Function;

/**
 * Created by krishna_hotha on 5/19/15 2015.
 */


public class FunctionTest {

	public static void printNumber(Integer number, Function<Integer, Integer> function) {

		Integer result = function.apply(number);
		System.out.println(result);
	}

	public  void printNumber(PrintTest pt){
		pt.printme(10);
	}

    public static void main(String[] args) {

        printNumber(10,val->val *10);
		printNumber(20,val->val *20);




    }
}
