package com.example.aop.pointcut.annotation;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

import com.example.aop.pointcut.SimpleBeanAdvice;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class AnnotationPointCutExample {

	public static void main(String[] args) {
		AnnotationMatchingPointcut annotationMatchingPointcut = AnnotationMatchingPointcut.forMethodAnnotation(AdviceRequired.class);

		SimpleBeanAdvice beanAdvice = new SimpleBeanAdvice();
		Advisor advisor = new DefaultPointcutAdvisor(annotationMatchingPointcut, beanAdvice);
		ProxyFactory proxyFactory = new ProxyFactory();

		proxyFactory.addAdvisor(advisor);
		proxyFactory.setTarget(new AnnotationBean());

		AnnotationBean annotationBean = (AnnotationBean) proxyFactory.getProxy();

		annotationBean.foo();

		annotationBean.bar();

	}
}
