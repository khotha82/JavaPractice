package com.example.aop.pointcut.regex;

import com.example.aop.pointcut.SimpleBeanAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class AspectjPointCutTest {


    public static void main(String[] args) {

        AspectJExpressionPointcut aspectJExpressionPointcut=new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression("execution(* foo*(..)");
        SimpleBeanAdvice beanAdvice = new SimpleBeanAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(aspectJExpressionPointcut, beanAdvice);
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(new RegexBean());

        RegexBean regexBean = (RegexBean) proxyFactory.getProxy();

        regexBean.foo();
        regexBean.foo1();
        regexBean.foo2();
        regexBean.bar();

    }
}
