package com.example.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/9/15.
 */
public class ConstructorConfusion {

	private String someValue;

	public ConstructorConfusion(String someValue) {
		this.someValue = someValue;
		System.out.println("in string method");
	}

	public ConstructorConfusion(int someValue) {

		this.someValue = Integer.toString(someValue);
		System.out.println("in integer method");
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		ConstructorConfusion constructorConfusion = (ConstructorConfusion) context.getBean("constructorConfusion");

	}
}
