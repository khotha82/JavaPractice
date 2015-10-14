package com.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */
@Component("a")
public class A {


    private B b;


    private C c;

    public A() {
        System.out.println("Creating instance A");
    }

    public B getB() {
        System.out.println("getting b");
        return b;
    }

    @Autowired
    public void setB(B b) {
        System.out.println("setting B");
        this.b = b;
    }

    public C getC() {
        return c;
    }

    @Autowired
    public void setC(C c) {
        System.out.println("setting c");
        this.c = c;
    }

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-annotation-different.xml");
        A a=(A)applicationContext.getBean("a");
        System.out.println(a);

    }
}
