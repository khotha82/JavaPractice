package com.example.methodreplacement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/10/15.
 */
public class ReplacementTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-methodreplace.xml");
         ReplacementTarget target=(ReplacementTarget) context.getBean("standard");
        ReplacementTarget target1=(ReplacementTarget) context.getBean("replacementTarget");
        target.printMethod();
        target1.printMethod();
    }
}
