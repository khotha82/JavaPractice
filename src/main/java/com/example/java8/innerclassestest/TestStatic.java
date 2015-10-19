package com.example.java8.innerclassestest;

import java.util.Comparator;

/**
 * Created by krishna_hotha on 10/7/15 2015.
 */
public class TestStatic {

	private String firstname;
	private String lastName;

	public TestStatic(String firstname, String lastName) {
		this.firstname = firstname;
		this.lastName = lastName;
	}

	public static void main(String[] args) {

		TestStatic testStatic = new TestStatic("Krishna", "Hotha");

		testStatic.getPrintName().print();

		System.out.println(testStatic.getComparator().compare(testStatic, testStatic));
	}

	public PrintName getPrintName() {

		return new PrintName();
	}

	public Comparator<TestStatic> getComparator() {

		return new Comparator<TestStatic>() {
			@Override
			public int compare(TestStatic o1, TestStatic o2) {

				return o1.getPrintName().fullName().compareTo(o2.getPrintName().fullName());
			}
		};
	}

	private class PrintName {

		void print() {
			System.out.println(firstname + " " + lastName);
		}

		String fullName() {
			return firstname + " " + lastName;
		}
	}
}
