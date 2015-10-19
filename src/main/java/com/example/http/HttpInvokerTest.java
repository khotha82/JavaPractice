package com.example.http;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 5/15/15 2015.
 */
public class HttpInvokerTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("spring-http.xml");

		ContactDAOService contactService =
				ctx.getBean("remoteContactService", ContactDAOService.class);
		System.out.println("Finding all contacts");
		System.out.println(contactService.getContactById(10));

	}
}
