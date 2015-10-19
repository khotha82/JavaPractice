package com.example.aop.pointcut.regex;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

import com.example.aop.pointcut.SimpleBeanAdvice;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class RegExPointCutTest {

	public static void main(String[] args) {

		JdkRegexpMethodPointcut regexpMethodPointcut = new JdkRegexpMethodPointcut();
		regexpMethodPointcut.setPattern(".*foo.*");
		SimpleBeanAdvice beanAdvice = new SimpleBeanAdvice();
		Advisor advisor = new DefaultPointcutAdvisor(regexpMethodPointcut, beanAdvice);
		ProxyFactory proxyFactory = new ProxyFactory();

		proxyFactory.addAdvisor(advisor);
		proxyFactory.setTarget(new RegexBean());

		RegexBean regexBean = (RegexBean) proxyFactory.getProxy();

		regexBean.foo();
		regexBean.foo1();
		regexBean.foo2();

	}
}
