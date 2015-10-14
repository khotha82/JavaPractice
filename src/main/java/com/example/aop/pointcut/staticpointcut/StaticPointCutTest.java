package com.example.aop.pointcut.staticpointcut;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.example.aop.pointcut.SimpleBean;
import com.example.aop.pointcut.SimpleBeanAdvice;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class StaticPointCutTest {

	public static void main(String[] args) {

		StaticPointCut staticPointCut = new StaticPointCut();
		SimpleBeanAdvice beanAdvice = new SimpleBeanAdvice();
		Advisor advisor = new DefaultPointcutAdvisor(staticPointCut, beanAdvice);
		ProxyFactory proxyFactory = new ProxyFactory();

		proxyFactory.addAdvisor(advisor);
		proxyFactory.setTarget(new SimpleBean());

		SimpleBean simpleBean1 = (SimpleBean) proxyFactory.getProxy();
		simpleBean1.foo();
		simpleBean1.bar();
	}
}
