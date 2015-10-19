package com.example.hello;

/**
 * Created by krishna_hotha on 6/19/15 2015.
 */
public class Manager extends Employee {

	protected int salary = 10;

	public static void main(String[] args) {

		Manager e = new Manager();
		System.out.println(e.getSalary());
		System.out.println(e.salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
