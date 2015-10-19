package com.example.beanaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/16/15.
 */
public class ShutdownHook implements ApplicationContextAware {

	ApplicationContext ctxt;

	public ShutdownHook() {

		System.out.println("calling the application context");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("calling this");
		this.ctxt = applicationContext;
		if (ctxt instanceof GenericXmlApplicationContext) {

			((GenericXmlApplicationContext) ctxt).registerShutdownHook();
			;
		}
	}

}
