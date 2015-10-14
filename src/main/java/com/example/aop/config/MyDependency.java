package com.example.aop.config;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class MyDependency {

	public void foo() {

		System.out.println("This is for Foo");
	}

	public void foo(int number) {

		System.out.println("this is for foo with number" + number);

	}

	public void bar() {

		System.out.println("this is for bar");
	}

}
