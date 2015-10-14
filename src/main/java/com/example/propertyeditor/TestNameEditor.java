package com.example.propertyeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/17/15.
 */
public class TestNameEditor {

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("spring-propertyeditor.xml");
        TestNameEditor editor= (TestNameEditor)context.getBean("testNameEditor");
        System.out.println(editor.getName());

    }
}
