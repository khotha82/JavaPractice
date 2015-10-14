package com.example.aop.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class AopSpringConfigTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-namespect-config.xml");


//        MyBean myBean1=(MyBean)context.getBean("myBean");
//        myBean1.execute();

        MyBean myBean2=(MyBean)context.getBean("myBean1");
        myBean2.execute();
    }
}
