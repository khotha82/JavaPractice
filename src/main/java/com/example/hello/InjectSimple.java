package com.example.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by krishna_hotha on 4/9/15.
 */

@Service("injectSimple")
public class InjectSimple {

	@Value("hotha")
	private String name;

	@Value("16")
	private String age;

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring-config-annotations.xml");
		ctx.refresh();

		InjectSimple messageRenderer = (InjectSimple) ctx.getBean("injectSimple");

		System.out.println(messageRenderer.toString());

	}

	@Override
	public String toString() {

		return name + " " + age;
	}
}
