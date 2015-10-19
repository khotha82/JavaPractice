package com.example.groovy;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class Employee {

	private String name;
	private String age;

	public Employee(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
