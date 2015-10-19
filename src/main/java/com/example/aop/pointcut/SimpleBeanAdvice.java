package com.example.aop.pointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by krishna_hotha on 4/23/15.
 */
public class SimpleBeanAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("i am calling  method" + methodInvocation.getMethod().getName());
		Object o = methodInvocation.proceed();
		System.out.println("done boyeee");
		return o;
	}
}
