package com.example.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by krishna_hotha on 4/21/15.
 */
public class SimpleMethodBeforeTest implements MethodBeforeAdvice {
	public static void main(String[] args) {

		MessageWriter messageWriter = new MessageWriter();

		SimpleMethodBeforeTest simpleMethodBeforeTest = new SimpleMethodBeforeTest();
		ProxyFactory pfs = new ProxyFactory();
		pfs.setTarget(messageWriter);
		pfs.addAdvice(simpleMethodBeforeTest);

		MessageWriter messageWriter1 = (MessageWriter) pfs.getProxy();
		messageWriter1.print();
		messageWriter1.printName();
	}

	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {

		System.out.println("before calling this method");
		System.out.println(method.getName());

	}
}
