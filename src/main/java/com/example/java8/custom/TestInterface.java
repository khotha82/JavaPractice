package com.example.java8.custom;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public interface TestInterface {

	static String printHello() {

		return "krsihhna";
	}

	default void printName() {

		System.out.println("hohtth" + this.toString());
	}
}
