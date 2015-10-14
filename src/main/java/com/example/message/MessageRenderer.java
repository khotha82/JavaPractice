package com.example.message;

/**
 * Created by krishna_hotha on 3/25/15.
 */
public interface MessageRenderer {

	public void render();

	public MessageProvider getMessageProvider();

	public void setMessageProvider(MessageProvider messageProvider);
}
