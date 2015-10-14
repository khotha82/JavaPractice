package com.example.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by krishna_hotha on 4/21/15.
 */
public class MessageWriterDecorator implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Welcome to Aop");

		Object returnValue = methodInvocation.proceed();

        System.out.println("It is thrilling");
		return returnValue;
	}
}
