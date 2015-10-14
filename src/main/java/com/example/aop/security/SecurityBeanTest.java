package com.example.aop.security;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by krishna_hotha on 4/21/15.
 */
public class SecurityBeanTest {

	public static void main(String[] args) {

		SecurityManager scm = new SecurityManager();
		scm.login("krishna", "123456");

        SecurityBean securityBean=getBean();
        securityBean.writeSecureMessage();

	}

	public static SecurityBean getBean() {

		SecurityBean securityBean = new SecurityBean();
        SecurityAdvice securityAdvice=new SecurityAdvice();
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.addAdvice(securityAdvice);
        proxyFactory.setTarget(securityBean);

        return (SecurityBean)proxyFactory.getProxy();
	}
}
