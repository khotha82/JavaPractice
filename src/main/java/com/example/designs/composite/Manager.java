package com.example.designs.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class Manager extends Employee {

	private List<Employee> employeeList = new ArrayList<>();

	public Manager(String name, String salary, String position) {
		super(name, salary, position);
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public void add(Employee employee) {

		assert (employee != null);
		employeeList.add(employee);
	}

	public void print() {
		super.print();

		System.out.println(this.getName() + " Reporties are ");

		for (Employee e : employeeList) {
			e.print();

		}
	}
}
