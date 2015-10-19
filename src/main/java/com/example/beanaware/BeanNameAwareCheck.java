package com.example.beanaware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by krishna_hotha on 4/16/15.
 */
public class BeanNameAwareCheck implements BeanNameAware {

	private String name;

	@Override
	public void setBeanName(String s) {

		this.name = s;
	}

	public void someOperation() {

		System.out.println("Doing some operation for eeee" + name);
	}

}
