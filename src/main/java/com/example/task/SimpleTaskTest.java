package com.example.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 5/13/15 2015.
 */
public class SimpleTaskTest {


    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-task.xml");

        while(true){

        }
    }
}
