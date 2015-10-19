package com.example.aop.security.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.util.StopWatch;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class WorkerBeanAdvice implements MethodInterceptor {
	public static void main(String[] args) {

		WorkerBean workerBean = new WorkerBean();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(workerBean);
		proxyFactory.addAdvice(new WorkerBeanAdvice());

		WorkerBean workerBean1 = (WorkerBean) proxyFactory.getProxy();

		workerBean1.doWork(10000);

	}

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object returnValue = methodInvocation.proceed();
		stopWatch.stop();
		dumbInfo(methodInvocation, stopWatch.getTotalTimeMillis());
		return returnValue;
	}

	private void dumbInfo(MethodInvocation methodInvocation, long totalTimeMillis) {

		System.out.println("long milliseconds " + totalTimeMillis);
		System.out.println(methodInvocation.getMethod().getName());
	}
}
