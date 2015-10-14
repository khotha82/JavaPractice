package com.example.aop.config;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class MyAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("Executing the method "+method.getName());
    }
}
