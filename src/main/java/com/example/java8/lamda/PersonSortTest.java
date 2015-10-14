package com.example.java8.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class PersonSortTest {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("krishna", 10), new Person("pranav", 3), new Person("Arnav", 5));

		Collections.sort(personList, (Person p1, Person p2) -> p1.getAge().compareTo(p2.getAge()));

		for (Person p : personList) {
			System.out.println(p.getName());
		}
		Collections.sort(personList, (p1, p2) -> p2.getAge().compareTo(p1.getAge()));
		for (Person p : personList) {
			System.out.println(p.getName());
		}
	}

}
