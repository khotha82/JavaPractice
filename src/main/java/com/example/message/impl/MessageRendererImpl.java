package com.example.message.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.message.MessageProvider;
import com.example.message.MessageRenderer;

/**
 * Created by krishna_hotha on 3/25/15.
 */
@Service("messageRenderer")
public class MessageRendererImpl implements MessageRenderer {

	@Autowired
	private MessageProvider messageProvider;

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public void render() {

		System.out.println("Message should be rendered" + messageProvider.generateMessage());
	}
}
