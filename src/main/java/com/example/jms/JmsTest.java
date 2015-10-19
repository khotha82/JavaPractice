package com.example.jms;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.jms.sender.SimpleMessageSender;

/**
 * Created by krishna_hotha on 5/18/15 2015.
 */
public class JmsTest {

	public static void main(String[] args) {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("spring-jms.xml", "spring-jms-sender.xml");
		context.refresh();

		SimpleMessageSender messageSender = context.getBean("simpleMessageSender", SimpleMessageSender.class);
		for (int i = 0; i < 10; i++) {
			messageSender.sendMessage("Test message: " + i);
		}

	}
}
