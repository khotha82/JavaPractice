package com.example.aop.aopflow;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * Created by krishna_hotha on 4/27/15 2015.
 */
public class ControlFlowPointCutExample {

	public static void main(String[] args) {

		ControlFlowPointcut controlFlowPointcut = new ControlFlowPointcut(ControlFlowPointCutExample.class, "test");

        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(controlFlowPointcut, new SimpleAdvice()));
	    proxyFactory.setTarget(new SimpleBean());

        SimpleBean simpleBean=(SimpleBean)proxyFactory.getProxy();
        simpleBean.print();
        test(simpleBean);
    }

    private static void test(SimpleBean simpleBean) {

        System.out.println("this is the test method");
        simpleBean.print();
    }
}
