package com.example.aop.annotatepureaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class SpringPureAopTest {


    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load(new String[] {"spring-pure-aspect.xml"});
        ctx.refresh();

        MessageWriter mw=new MessageWriter();
        mw.foo();
        mw.writeMessage();
    }
}
