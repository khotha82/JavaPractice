package com.example.aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by krishna_hotha on 4/21/15.
 */
public class MessageProxyTest {

    public static void main(String[] args) {

        MessageWriter messageWriter=new MessageWriter();
        MessageWriterDecorator messageWriterDecorator=new MessageWriterDecorator();
        ProxyFactory factory=new ProxyFactory();
        factory.addAdvice(messageWriterDecorator);
        factory.setTarget(messageWriter);


        messageWriter.print();
        MessageWriter messageWriter1= (MessageWriter) factory.getProxy();
        messageWriter1.print();
        messageWriter1.printName();
    }

}
