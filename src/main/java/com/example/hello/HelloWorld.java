package com.example.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.message.MessageRenderer;

/**
 * Created by krishna_hotha on 3/25/15.
 */
public class HelloWorld {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		MessageRenderer renderer = (MessageRenderer) context.getBean("messageRender");
		MessageRenderer renderer1 = (MessageRenderer) context.getBean("messageRender");
		System.out.println(renderer == renderer1);
		System.out.println(renderer.getMessageProvider() == renderer1.getMessageProvider());

		renderer.render();
	}
}
