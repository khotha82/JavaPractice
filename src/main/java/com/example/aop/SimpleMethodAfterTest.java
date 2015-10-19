package com.example.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class SimpleMethodAfterTest implements AfterReturningAdvice {
	public static void main(String[] args) {

		MessageWriter messageWriter = new MessageWriter();

		SimpleMethodAfterTest simpleMethodAfterTest = new SimpleMethodAfterTest();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addAdvice(simpleMethodAfterTest);
		proxyFactory.setTarget(messageWriter);
		MessageWriter messageWriter1 = (MessageWriter) proxyFactory.getProxy();

		messageWriter1.print();
	}

	@Override
	public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

		System.out.println("this is after return the method");
	}

}
