package com.example.methodreplacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by krishna_hotha on 4/10/15.
 */
public class Replacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {

        if(o instanceof ReplacementTarget){
            replaceMethod(method);
        }

        return "hello";
    }

    private void replaceMethod(Method method) {

        System.out.println("Replaced methods good ");
    }
}
