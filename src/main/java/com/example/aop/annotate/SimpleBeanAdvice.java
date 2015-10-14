package com.example.aop.annotate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
//@Aspect
//@Component("simpleBeanAdvice")
public class SimpleBeanAdvice {


//    @Pointcut("bean(simpleBean)")
//    public void forAllMethods(){
//
//    }
//
//    @Before("forAllMethods()")
//    public void printName(JoinPoint jointPoint){
//
//
//        System.out.println("this scares me");
//
//        System.out.println("Executing the method ddddd"+jointPoint.getSignature());
//    }
//
//    @Around("forAllMethods()")
//    public void afterAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//
//        System.out.println("Enter the dragon");
//        proceedingJoinPoint.proceed();
//        System.out.println("Exit the dragon");
//
//        System.out.println("----------");
//    }

}
