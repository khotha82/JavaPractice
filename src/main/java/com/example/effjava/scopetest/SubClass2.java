package com.example.effjava.scopetest;

/**
 * Created by krishna_hotha on 9/20/15 2015.
 */
class SubClass2 extends ParentTest {
	@Override
	public void printMe() {

		System.out.println("in subclass2 method");
	}

	public void killMe() {

		System.out.println("kill me");
	}
}
