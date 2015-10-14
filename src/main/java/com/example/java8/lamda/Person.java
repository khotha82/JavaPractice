package com.example.java8.lamda;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class Person {

    private String name;
    private Integer age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
