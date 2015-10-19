package com.example.aop.annotate;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class AopAnnotationTest {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring-aop-annotate.xml");
		ctx.refresh();
		SimpleBeanWrapper simpleBeanWrapper = (SimpleBeanWrapper) ctx.getBean("simpleBeanWrapper");
		simpleBeanWrapper.execute();
	}
}
