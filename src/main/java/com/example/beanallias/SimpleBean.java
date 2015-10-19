package com.example.beanallias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/13/15.
 */
public class SimpleBean {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beanalias.xml");

		String s = (String) context.getBean("string1");
		String s1 = (String) context.getBean("string2");
		String s2 = (String) context.getBean("string3");
		String s3 = (String) context.getBean("string4");

		System.out.println(s == s1);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s);
	}

}
