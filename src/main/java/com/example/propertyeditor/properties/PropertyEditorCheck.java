package com.example.propertyeditor.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 5/6/15 2015.
 */
public class PropertyEditorCheck {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-convertdate.xml");
		Contact editor = (Contact) context.getBean("contact");
		System.out.println(editor);

		Contact anotherContact = (Contact) context.getBean("anotherContact");
		System.out.println(anotherContact);
	}
}
