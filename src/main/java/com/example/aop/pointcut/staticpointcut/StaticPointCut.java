package com.example.aop.pointcut.staticpointcut;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.example.aop.pointcut.SimpleBean;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class StaticPointCut extends StaticMethodMatcherPointcut {
	@Override
	public boolean matches(Method method, Class<?> aClass) {

		return method.getName().equals("bar");
	}

	@Override
	public ClassFilter getClassFilter() {

		return (aClass) -> (aClass == SimpleBean.class);
	}

}
