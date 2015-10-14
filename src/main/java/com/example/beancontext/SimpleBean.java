package com.example.beancontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/14/15.
 */
public class SimpleBean {

    private  String name;
    private  String age;


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext("spring-context.xml");

        SimpleBean sb=(SimpleBean)context.getBean("simple");
        context.registerShutdownHook();
        System.out.println(sb.getAge());
        System.out.println(sb.getName());


    }

    public  void init(){


        System.out.println(age +" "+name);
        System.out.println("int the init method");
    }

    public void destroy (){

        System.out.println("distroing the bean");
    }


}
