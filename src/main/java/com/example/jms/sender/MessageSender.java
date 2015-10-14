package com.example.jms.sender;

import javax.jms.Message;

/**
 * Created by krishna_hotha on 5/18/15 2015.
 */
public interface MessageSender {

    public void sendMessage(String message);
}
