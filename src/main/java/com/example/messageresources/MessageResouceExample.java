package com.example.messageresources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

/**
 * Created by krishna_hotha on 4/17/15.
 */
public class MessageResouceExample {


    public static void main(String[] args) {

        GenericXmlApplicationContext ac=new GenericXmlApplicationContext("spring-messages.xml");


        String messae1=ac.getMessage("msg",null,Locale.ENGLISH);
        System.out.println(messae1);
        String message2=ac.getMessage("msg",null,new Locale("cs","CZ"));
        System.out.println(message2);

        String message3=ac.getMessage("msg2",new Object[]{"krishna","hotha"},Locale.ENGLISH);
        System.out.println(message3);

    }
}
