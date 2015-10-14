package com.example.java8.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by krishna_hotha on 10/8/15 2015.
 */
public class GenericTest {

	public static void print(List<? extends Object> list) {

		for (Object s : list) {
			System.out.println(s);
		}

	}

	public static  void addElementList(List<?>list){

		addHelper(list);
	}
	public static  <E>void addHelper(List<E> list){

		E a=(E)"k23";
		list.add(a);
	}

	public static <E> Set<E>union(Set<? extends E>set1,Set<? extends E> set2){


		Set<E>thirdSet=new HashSet<>(set1);

		thirdSet.addAll(set2);

		return thirdSet;
	}

	public static void main(String[] args) {

//		List<String> stringList = new ArrayList<>();
//
//        stringList.add("hotha");
//		stringList.add("hotha krishna");
//		stringList.add("hotha pranav");
//		stringList.add("hotha arnav");
//
//        print(stringList);
//
//        List<Integer> numberList = new ArrayList<>();
//
//        numberList.add(1);
//        numberList.add(2);
//        numberList.add(3);
//        numberList.add(4);
//
//        print(numberList);
//
		Set<Integer>set1=new HashSet<>();
		Set<Double>set2=new HashSet<>();

		set1.add(10);
		set2.add(30.2);
		Set<Number>set=union(set1, set2);
		System.out.println(set);
	}
}
