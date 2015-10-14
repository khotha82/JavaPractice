package com.example.com.example.com.example.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna_hotha on 3/27/15.
 */
public class Box<T> {

	T id;

	public static void main(String[] args) {

		Box<String> b = new Box<String>();
		Box<Integer> b1 = new Box<Integer>();
		Box<Float> b3 = new Box<>();

		Box gen = new Box();

		b.setId("Hohta");
		b1.setId(10);

       Serializable s= b1.pick("d", new ArrayList<String>());
        System.out.println(s);

        List<Integer>numbers=new ArrayList<>();
        numbers.add(new Integer(10));
        numbers.add(new Integer(29));


		System.out.println(b.getId() + "" + b1.getId()+" "+ b.sum(numbers));
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public Integer sum(List<? extends Number> a) {

		Integer s = 0;

		for (Number t : a) {
			s += t.intValue();
		}

		return s;
	}

	public <T> T pick(T a1, T a2) {
		return a2;
	}
}
