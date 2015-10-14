package com.example.aop.aopflow;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by krishna_hotha on 4/27/15 2015.
 */
public class SimpleAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("Calling "+method.getName());

    }
}
