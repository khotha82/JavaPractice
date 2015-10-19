package com.example.jms.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 5/18/15 2015.
 */
@Component("simpleMessageSender")
public class SimpleMessageSender implements MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Override
	public void sendMessage(String message) {

		this.jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {

				return session.createTextMessage(message);
			}
		});
	}

}
