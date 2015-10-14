package com.example.effjava.enumtest;

/**
 * Created by krishna_hotha on 9/21/15 2015.
 */
public enum DriverManager {

	INSTANCE;

	private static final String s;

    static {
        s="hello";
    }
	public void print() {

		System.out.println("hello check me" + s);
	}

	DriverManager() {

		System.out.println("creating this consrrr");
	}
}
