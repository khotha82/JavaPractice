package com.example.aop.pointcut.annotation;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class AnnotationBean {

	public void foo() {

		System.out.println("this is foo method");
	}

	@AdviceRequired
	public void bar() {

		System.out.println("this is bar method");
	}
}
