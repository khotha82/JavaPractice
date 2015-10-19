package com.example.beancontext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/14/15.
 */
public class BeanCheckWithInterface implements InitializingBean, DisposableBean {

	private String name;
	private String age;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

		BeanCheckWithInterface sb = (BeanCheckWithInterface) context.getBean("simple1");
		System.out.println(sb.getAge());
		System.out.println(sb.getName());

	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void beanInitMethod() {
		System.out.println("in bean new init method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Calling after properties ");
	}

	@PostConstruct
	public void init() {

		System.out.println("this is post construct");
	}

	public void destroyMyBean() {

		System.out.println("this is in destroy my bean method");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("int destroy methodddd");
	}

	@PreDestroy
	public void killMe() {

		System.out.println("killing method");
	}
}
