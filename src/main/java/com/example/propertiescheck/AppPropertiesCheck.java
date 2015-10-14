package com.example.propertiescheck;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class AppPropertiesCheck {

    public static void main(String[] args) {

        GenericXmlApplicationContext context=new GenericXmlApplicationContext("spring-properties.xml");
        AppProperties app=(AppProperties)context.getBean("appproperties");
        System.out.println(app.getAge());
        System.out.println(app.getName());
    }
}
