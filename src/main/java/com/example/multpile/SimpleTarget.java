package com.example.multpile;

import com.example.message.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/9/15.
 */
public class SimpleTarget {

    private String value;


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
//        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
//        parent.load("spring-parent.xml");
//        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("spring-child.xml");
        //child.setParent(parent);
        child.refresh();

        SimpleTarget target1 = (SimpleTarget) child.getBean("simpleTarget");
        SimpleTarget target2 = (SimpleTarget) child.getBean("simpleTarget1");
        SimpleTarget target3 = (SimpleTarget) child.getBean("simpleTarget2");

        System.out.println(target1.getValue());
        System.out.println(target2.getValue());
        System.out.println(target3.getValue());
    }

}
