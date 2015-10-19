package com.example.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/13/15.
 */
public class MyBean {

	private String name;
	private String age;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-inheritance.xml");
		MyBean mb = (MyBean) context.getBean("inheritParent");
		System.out.println(mb.getAge() + mb.getName());

		MyBean mb1 = (MyBean) context.getBean("inheritChild");
		System.out.println(mb1.getAge() + mb1.getName());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
