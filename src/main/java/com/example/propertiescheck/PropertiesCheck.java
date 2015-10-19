//package com.example.propertiescheck;
//
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.core.env.MutablePropertySources;
//
///**
// * Created by krishna_hotha on 4/20/15.
// */
//public class PropertiesCheck {
//
//	private String name;
//
//	public static void main(String[] args) {
//
//		GenericXmlApplicationContext gs = new GenericXmlApplicationContext("spring-properties.xml");
//		MutablePropertySources ms ;
//
//		AppIntializer appIntializer = new AppIntializer();
//
//		appIntializer.initialize(gs);
//		AppProperties app = (AppProperties) gs.getBean("appproperties");
//		System.out.println(app.getAge());
//		System.out.println(app.getName());
//
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}
