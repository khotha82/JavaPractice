package com.example.effjava.chapter2;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by krishna_hotha on 9/29/15 2015.
 */
public class CompareTest {

	public static void main(String[] args) {

		BigDecimal bigDecimal = new BigDecimal("1.0");
		BigDecimal bigDecimal2 = new BigDecimal("1.00");

		HashSet<BigDecimal> hashSet = new HashSet<>();
		hashSet.add(bigDecimal);
		hashSet.add(bigDecimal2);

		System.out.println(hashSet.size());
		System.out.println(hashSet);

		TreeSet<BigDecimal> treeSetSet = new TreeSet<>();
		treeSetSet.add(bigDecimal);
		treeSetSet.add(bigDecimal2);

		System.out.println(treeSetSet.size());
		System.out.println(treeSetSet);
	}

}
