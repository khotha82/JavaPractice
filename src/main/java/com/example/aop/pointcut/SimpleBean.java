package com.example.aop.pointcut;

/**
 * Created by krishna_hotha on 4/23/15.
 */
public class SimpleBean {

	public void foo() {

		System.out.println("this is foo method");
	}

	public void bar() {

		System.out.println("this is for bar method");
	}

	public void foo(int n){

		System.out.println("calling n with the following"+n);
	}
}
