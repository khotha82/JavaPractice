package com.example.aop.security.around;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class MySystemException extends Throwable {

    public MySystemException(ArithmeticException ex) {

        System.out.println(ex);
    }
}
