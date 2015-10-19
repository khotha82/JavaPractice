package com.example.effjava.scopetest;

/**
 * Created by krishna_hotha on 9/20/15 2015.
 */
public abstract class ParentTest {

	public static ParentTest getParent(String s) {

		if (s.equalsIgnoreCase("child1")) {
			return new SubClass();
		}
		else {
			return new SubClass2();
		}
	}

	public abstract void printMe();

}
