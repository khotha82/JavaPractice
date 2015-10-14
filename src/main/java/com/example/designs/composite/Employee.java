package com.example.designs.composite;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public abstract class Employee {

	private String name;
	private String salary;
	private String position;

    public Employee(String name, String salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }


    public String getSalary() {
        return salary;
    }


    public String getPosition() {
        return position;
    }


    public void print(){

        System.out.println("Employee Details");

        System.out.println("Name"+getName());
        System.out.println("Salary"+getSalary());
        System.out.println("position"+getPosition());

        System.out.println();
        System.out.println();
    }
}
