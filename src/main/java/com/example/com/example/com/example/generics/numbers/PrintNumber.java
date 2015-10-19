package com.example.com.example.com.example.generics.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by krishna_hotha on 3/31/15.
 */
public class PrintNumber {

	public static void print(List<? extends Number> list) {
		for (Number n : list)
			System.out.print(n + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		List<EvenNumber> le = new ArrayList<>();

		le.add(new EvenNumber(1));
		le.add(new EvenNumber(2));
		le.add(new EvenNumber(3));

		List<? extends NaturalNumber> la = le;

		Iterator<? extends NaturalNumber> it = la.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
			it.remove();
			System.out.println(la.size());
		}

		print(Arrays.asList(10, 20, 30));

	}
}
