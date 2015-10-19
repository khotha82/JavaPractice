package com.example.aop.pointcut;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * Created by krishna_hotha on 4/23/15.
 */
public class PointCutTest {

	public static void main(String[] args) {

		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.addMethodName("foo");

		ProxyFactory proxyFactory = new ProxyFactory();
		SimpleBean simpleBean = new SimpleBean();
		SimpleBeanAdvice beanAdvice = new SimpleBeanAdvice();

		Advisor advisor = new DefaultPointcutAdvisor(pointcut, beanAdvice);
		proxyFactory.addAdvisor(advisor);
		proxyFactory.setTarget(simpleBean);

		SimpleBean simpleBean1 = (SimpleBean) proxyFactory.getProxy();
		simpleBean1.foo();
		simpleBean1.bar();
	}

}
