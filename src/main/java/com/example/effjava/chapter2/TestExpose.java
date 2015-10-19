package com.example.effjava.chapter2;

import com.example.effjava.chapter1.ExposeTest;

/**
 * Created by krishna_hotha on 9/30/15 2015.
 */
public class TestExpose {

	public static void main(String[] args) {

		ExposeTest exposeTest = new ExposeTest();

		System.out.println(exposeTest.getParent());
	}
}
