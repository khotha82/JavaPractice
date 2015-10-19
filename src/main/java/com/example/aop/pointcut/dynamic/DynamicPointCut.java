package com.example.aop.pointcut.dynamic;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class DynamicPointCut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return method.getName().equals("foo");
	}

	@Override
	public boolean matches(Method method, Class<?> aClass, Object[] objects) {

		System.out.println("dynamci check for : : : " + method.getName());

		if (objects != null && objects.length > 1) {
			int i = (int) objects[0];
			return (i == 100);
		}
		return false;
	}
}
