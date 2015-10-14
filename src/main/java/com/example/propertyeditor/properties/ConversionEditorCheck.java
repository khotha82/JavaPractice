package com.example.propertyeditor.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

import com.example.propertyeditor.convertors.AnotherContact;

/**
 * Created by krishna_hotha on 5/6/15 2015.
 */
public class ConversionEditorCheck {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-conversion.xml");
		Contact editor = (Contact) context.getBean("contact");
		System.out.println(editor);
		ConversionService conversionService = context.getBean(ConversionService.class);

		AnotherContact anotherContact = conversionService.convert(editor, AnotherContact.class);
        System.out.println(anotherContact);


	}
}
