package com.example.aop.annotate;

import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
@Component("simpleBean")
public class SimpleBean {

    public SimpleBean() {
    }

    public void foo(){
        System.out.println("this is foo");
    }
    public void bar(){

        System.out.println("this is bar");
    }
}
