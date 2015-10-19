package com.example.aop.pointcut.performace;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class PerformanceTest {

	public static void main(String[] args) {

		SimpleBeanAdvice simpleBeanAdvice = new SimpleBeanAdvice();

		Advisor advisor = new DefaultPointcutAdvisor(new SimplePointCut(), simpleBeanAdvice);

		runCGlibTest(simpleBeanAdvice, advisor);
		runCGlibFrozen(simpleBeanAdvice, advisor);
		runJdkTests(simpleBeanAdvice, advisor);
	}

	private static void runCGlibFrozen(SimpleBeanAdvice simpleBeanAdvice, Advisor advisor) {

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setProxyTargetClass(true);
		proxyFactory.setTarget(new SimpleBeanImpl());
		proxyFactory.addAdvisor(advisor);
		proxyFactory.setFrozen(true);

		SimpleBean simpleBean = (SimpleBean) proxyFactory.getProxy();
		System.out.println("running cglib Frozen test");
		test(simpleBean);
	}

	private static void runJdkTests(SimpleBeanAdvice simpleBeanAdvice, Advisor advisor) {

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(SimpleBean.class);
		proxyFactory.setTarget(new SimpleBeanImpl());
		proxyFactory.addAdvisor(advisor);
		proxyFactory.setFrozen(true);

		SimpleBean simpleBean = (SimpleBean) proxyFactory.getProxy();
		System.out.println("running jdk  test");
		test(simpleBean);
	}

	private static void runCGlibTest(SimpleBeanAdvice simpleBeanAdvice, Advisor advisor) {

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setProxyTargetClass(true);
		proxyFactory.setTarget(new SimpleBeanImpl());
		proxyFactory.addAdvisor(advisor);

		SimpleBean simpleBean = (SimpleBean) proxyFactory.getProxy();
		System.out.println("running cglib standard test");
		test(simpleBean);
	}

	private static void test(SimpleBean bean) {

		long before = 0;
		long after = 0;
		System.out.println("Testing Advised Method");
		before = System.currentTimeMillis();
		for (int x = 0; x < 500000; x++) {
			bean.advised();
		}
		after = System.currentTimeMillis();
		System.out.println("Took " + (after - before) + " ms");
		System.out.println("Testing Unadvised Method");
		before = System.currentTimeMillis();
		for (int x = 0; x < 500000; x++) {
			bean.unAdvised();
		}
		after = System.currentTimeMillis();
		System.out.println("Took " + (after - before) + " ms");
		System.out.println("Testing equals() Method");
		before = System.currentTimeMillis();
		for (int x = 0; x < 500000; x++) {
			bean.equals(bean);
		}
		after = System.currentTimeMillis();
		System.out.println("Took " + (after - before) + " ms");
		System.out.println("Testing hashCode() Method");
		before = System.currentTimeMillis();
		for (int x = 0; x < 500000; x++) {
			bean.hashCode();
		}
		after = System.currentTimeMillis();
		System.out.println("Took " + (after - before) + " ms");
		Advised advised = (Advised) bean;
		System.out.println("Testing Advised.getProxyTargetClass() Method");
		before = System.currentTimeMillis();
		for (int x = 0; x < 500000; x++) {
			advised.getTargetClass();
		}
		after = System.currentTimeMillis();
		System.out.println("Took " + (after - before) + " ms");
	}

}
