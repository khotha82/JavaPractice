package com.example.aop.security;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by krishna_hotha on 4/21/15.
 */
public class SecurityAdvice implements MethodBeforeAdvice {

    private SecurityManager securityManager;

    public SecurityAdvice() {

        this.securityManager=new SecurityManager();
    }


    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        UserInfo user=securityManager.getUser();
        if (user == null) {
            System.out.println("No user authenticated");
            throw new SecurityException(
                    "You must login before attempting to invoke the method: "
                            + method.getName());
        } else if ("krishna".equals(user.getName())) {
            System.out.println("Logged in user is Krishna - OKAY!");
        } else {
            System.out.println("Logged in user is " + user.getName()
                    + " NOT GOOD :(");
            throw new SecurityException("User " + user.getName()
                    + " is not allowed access to method " + method.getName());
        }

    }
}
