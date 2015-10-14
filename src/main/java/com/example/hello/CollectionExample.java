package com.example.hello;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/10/15.
 */
public class CollectionExample {

	private Map<String, Object> stringObjectMap;
	private Properties props;
	private Set set;
	private List list;

	public Map<String, Object> getStringObjectMap() {
		return stringObjectMap;
	}

	public void setStringObjectMap(Map<String, Object> stringObjectMap) {
		this.stringObjectMap = stringObjectMap;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-collection.xml");
		CollectionExample ce = (CollectionExample) context.getBean("collectionExample");
		displayInfo(ce);

	}

	public static void displayInfo(CollectionExample collectionExample) {

		System.out.println("Printing the Map values");

		for (Map.Entry<String, Object> entry : collectionExample.getStringObjectMap().entrySet()) {

			System.out.println("Entry " + entry.getValue() + " " + entry.getKey());
		}
		for (Map.Entry<Object, Object> entry : collectionExample.getProps().entrySet()) {

			System.out.println("Entry " + entry.getValue() + " " + entry.getKey());
		}
		for (Object object : collectionExample.getList()) {
			System.out.println(object.toString());
		}
		for (Object object : collectionExample.getSet()) {
			System.out.println(object.toString());
		}
	}
}
