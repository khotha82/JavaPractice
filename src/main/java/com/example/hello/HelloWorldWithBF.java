package com.example.hello;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.example.message.MessageRenderer;

/**
 * Created by krishna_hotha on 4/8/15.
 */
public class HelloWorldWithBF {

	public static void main(String[] args) {

		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(bf);
		rdr.loadBeanDefinitions(new ClassPathResource("spring-config.xml"));
		MessageRenderer mr = (MessageRenderer) bf.getBean("messageRender");
		System.out.println(mr);

	}
}
