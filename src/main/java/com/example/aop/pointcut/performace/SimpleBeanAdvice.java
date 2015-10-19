package com.example.aop.pointcut.performace;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class SimpleBeanAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {

	}

}
