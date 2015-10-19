package com.example.java8.constructorTest;

/**
 * Created by krishna_hotha on 4/27/15 2015.
 */
public class SimpleConTest {

	String name;
	int age;
	Float salary;

	public SimpleConTest(String name, int age, Float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public SimpleConTest(int age, String name, Float salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public SimpleConTest(Float salary, String name, int age) {
		this.salary = salary;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		new SimpleConTest("krishna", 10, 10.2f);
		new SimpleConTest(10, "krishna", 10.2f);
		new SimpleConTest(10.3f, "krishna", 10);

	}
}
