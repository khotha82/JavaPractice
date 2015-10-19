package com.example.java8.streams;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

/**
 * Created by krishna_hotha on 5/19/15 2015.
 */
public class StreamTest {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(
				new Employee("krishna", 1),
				new Employee("hotha", 2),
				new Employee("hhh", 3)
				);

		List<Integer> transIds = employeeList.stream().map(Employee::getId).collect(toList());

		System.out.println(transIds);
	}

	public static class Employee {

		private String name;
		private Integer id;

		public Employee(String name, Integer id) {
			this.name = name;
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	}
}
