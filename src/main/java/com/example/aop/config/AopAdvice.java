package com.example.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class AopAdvice {

    public void printName(JoinPoint jointPoint,int intValue){

        if(intValue!=100){
            System.out.println("this scares me");
        }
        System.out.println("Executing the method ddddd"+jointPoint.getSignature());
    }

    public void afterAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("Enter the dragon");
        proceedingJoinPoint.proceed();
        System.out.println("Exit the dragon");

        System.out.println("----------");
    }
}
