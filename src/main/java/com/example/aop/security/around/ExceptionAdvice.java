package com.example.aop.security.around;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class ExceptionAdvice  implements ThrowsAdvice{



    public void afterThrowing(Exception ex) throws Exception {

        logException(ex);
        throw ex;
    }

    public void afterThrowing(Method method, Object[] args, Object target,
                              ArithmeticException ex) throws MySystemException {

        System.out.println("this is kind of new exception");
        throw new MySystemException(ex);
    }

    private void logException(Exception ex) {

        System.out.println("throwing this exception");
    }

    public static void main(String[] args) {

        ExceptionBean exceptionBean=new ExceptionBean();
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(exceptionBean);
        proxyFactory.addAdvice(new ExceptionAdvice());

        ExceptionBean beans=(ExceptionBean)proxyFactory.getProxy();

        beans.throwError();
        System.out.println("cheekkkkk");
    }


}
