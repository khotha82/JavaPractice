package com.example.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by krishna_hotha on 5/18/15 2015.
 */
public class SimpleMessageListener implements MessageListener {


    @Override
    public void onMessage(Message message) {

        TextMessage textMessage=(TextMessage)message;
        try {
            System.out.println(textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }


}
