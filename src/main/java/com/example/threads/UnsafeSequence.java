package com.example.threads;

/**
 * Created by krishna_hotha on 5/28/15 2015.
 */
public class UnsafeSequence {

	private int value = 0;

	public static void main(String[] args) {

		Integer i = 0;
		Integer j = i;
		i++;
		i++;

		System.out.println(i + "  " + j);
	}

	public int getValue() {
		return value++;
	}

}
