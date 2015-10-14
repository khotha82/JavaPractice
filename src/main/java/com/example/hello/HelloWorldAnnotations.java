package com.example.hello;

import com.example.message.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.message.MessageProvider;

/**
 * Created by krishna_hotha on 4/9/15.
 */
public class HelloWorldAnnotations {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring-config-annotations.xml");
		ctx.refresh();

        MessageRenderer messageRenderer=(MessageRenderer)ctx.getBean("messageRenderer");

		messageRenderer.render();
	}

}
