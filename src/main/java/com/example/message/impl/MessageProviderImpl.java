package com.example.message.impl;

import com.example.message.MessageProvider;
import org.springframework.stereotype.Service;

/**
 * Created by krishna_hotha on 3/25/15.
 */
@Service("messageProvider")
public class MessageProviderImpl implements MessageProvider {

	public String generateMessage() {

		return "Hello World from provider";
	}
}
