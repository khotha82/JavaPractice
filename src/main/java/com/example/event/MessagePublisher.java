package com.example.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class MessagePublisher implements ApplicationContextAware {

	private ApplicationContext context;

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-messageEvents.xml");

		MessagePublisher publisher = (MessagePublisher) applicationContext.getBean("publisher");
		publisher.publish(new MessageEvent(publisher, "Hello bOSS HOW RU"));
		System.out.println("prirnnnn");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.context = applicationContext;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public void publish(MessageEvent event) {
		context.publishEvent(event);
	}
}
