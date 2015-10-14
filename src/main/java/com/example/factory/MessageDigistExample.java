package com.example.factory;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by krishna_hotha on 4/16/15.
 */
public class MessageDigistExample {

    public static void main(String[] args) throws NoSuchAlgorithmException {


        GenericXmlApplicationContext context = new GenericXmlApplicationContext
                ("spring-factory-thirdparty.xml");
        MessageDigistCheck check= (MessageDigistCheck) context.getBean("messageDigistCheck");
        check.digest("my message");


    }
}
