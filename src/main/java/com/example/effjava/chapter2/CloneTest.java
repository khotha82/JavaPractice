package com.example.effjava.chapter2;

/**
 * Created by krishna_hotha on 6/30/15 2015.
 */

class Parent {

	String string;
	Object[] elements;

	public Parent(String string) {
		this.string = string;
		elements = new Object[] { "1", "2" };
	}

	public void findMe() {
		System.out.println("calling find me in parent");
	}

	public void print() {
		System.out.println("this is print method in parent");
	}

}

class Child extends Parent implements Cloneable {

	String string;

	public Child(String string) {
		super(string);
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("print in child class" + string);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Child o = (Child) super.clone();

		o.elements = elements.clone();
		return o;
	}

}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Child child = new Child("child");

		Parent child3 = new Child("parent");

		Parent child2 = (Child) child.clone();
		;
		child.elements[0] = "love love love ";
		child2.findMe();
		child2.print();
		System.out.println(child2.elements[0]);

		System.out.println(child2.getClass());
	}
}
