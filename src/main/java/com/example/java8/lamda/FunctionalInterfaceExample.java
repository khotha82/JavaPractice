package com.example.java8.lamda;

/**
 * Created by krishna_hotha on 9/15/15 2015.
 */

@FunctionalInterface
interface Convertor<F, T> {

	T convert(F from);

}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Convertor<String, Integer> convertor = (from) -> Integer.valueOf(from);
		Integer conv = convertor.convert("10");
		System.out.println(conv);
	}
}
