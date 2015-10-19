package com.example.factory;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by krishna_hotha on 4/16/15.
 */
public class MessageDigistFactory implements FactoryBean<MessageDigest>, InitializingBean {

	private MessageDigest messageDigest;
	private String algorithemName = "MD5";

	public String getAlgorithemName() {
		return algorithemName;
	}

	public void setAlgorithemName(String algorithemName) {
		this.algorithemName = algorithemName;
	}

	public MessageDigest getMessageDigest() {
		return messageDigest;
	}

	public void setMessageDigest(MessageDigest messageDigest) {
		this.messageDigest = messageDigest;
	}

	@Override
	public MessageDigest getObject() throws Exception {

		return messageDigest;
	}

	@Override
	public Class<MessageDigest> getObjectType() {
		return MessageDigest.class;
	}

	@Override
	public boolean isSingleton() {

		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		messageDigest = MessageDigest.getInstance(algorithemName);
	}
}
