package com.example.aop.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.inheritance.*;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class AopConfigTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
		/*
		 * MyBean myBean=(MyBean)context.getBean("myBean"); myBean.execute();
		 */

		MyBean myBean1 = (MyBean) context.getBean("myBean1");
		myBean1.execute();
	}
}
