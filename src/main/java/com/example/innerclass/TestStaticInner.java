package com.example.innerclass;

/**
 * Created by krishna_hotha on 7/10/15 2015.
 */
public class TestStaticInner {

	private static int j = 0;
	private int i = 0;

	public static void main(String[] args) {

		TestStaticInner nonStatic = new TestStaticInner();

	}

	public void printMe() {

		System.out.println("heelo" + i);
	}

	private static class StaticInner {

		public void print() {

			System.out.println("hello" + " " + j);

		}
	}

	class NonStatic {

		public void print() {
			printMe();
		}
	}
}
