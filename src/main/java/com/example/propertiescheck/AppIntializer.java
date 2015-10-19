package com.example.propertiescheck;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class AppIntializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

		System.out.println("heelooo");
		System.out.println(configurableApplicationContext.getEnvironment().getProperty("appEnv"));
	}
}
