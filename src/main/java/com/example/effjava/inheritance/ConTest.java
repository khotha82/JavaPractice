package com.example.effjava.inheritance;

import java.util.Date;

/**
 * Created by krishna_hotha on 7/7/15 2015.
 */

class Parent {

	public Parent() {

		overrideMe();
	}

	public void overrideMe() {
		System.out.println("in parent method");
	}
}

class Child extends Parent {

	private final Date date; // Blank final, set by constructor

	Child() {
		date = new Date();
	}

	// Overriding method invoked by superclass constructor
	@Override
	public void overrideMe() {
		System.out.println(date);
	}

}

public class ConTest {

	public static void main(String[] args) {
		Child sub = new Child();
		sub.overrideMe();
	}
}
