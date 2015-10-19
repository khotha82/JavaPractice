package com.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/13/15.
 */
public class SimpleTarget {

	private Foo foo;
	private Bar bar;
	private Foo Foo2;

	public SimpleTarget() {

		System.out.println("Target is called");
	}

	public SimpleTarget(Foo foo) {
		this.foo = foo;
		System.out.println("Target is called with foo");
	}

	public SimpleTarget(Bar bar, Foo foo) {
		this.bar = bar;
		this.foo = foo;
		System.out.println("Target is called with foo & bar");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Autowire default");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowire.xml");
		SimpleTarget ce = (SimpleTarget) context.getBean("autowireByDefault");
		System.out.println("===========Done============");

		System.out.println("Autowire name");
		SimpleTarget ce1 = (SimpleTarget) context.getBean("autowireByName");

		System.out.println("===========Done============");

		System.out.println("Autowire type");
		SimpleTarget ce3 = (SimpleTarget) context.getBean("autowireByType");

		System.out.println("===========Done============");

		System.out.println("Constructor type");
		SimpleTarget ce4 = (SimpleTarget) context.getBean("autowireByConstructor");

		System.out.println("===========Done============");
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
		System.out.println("setting the foo");
	}

	public void setFoo2(Foo foo2) {
		Foo2 = foo2;
		System.out.println("setting foo2");
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setting boo2");
	}

}
