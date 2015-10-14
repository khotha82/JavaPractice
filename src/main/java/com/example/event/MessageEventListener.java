package com.example.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class MessageEventListener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {

        System.out.println("i am getting this message"+messageEvent.getMessage());
    }
}
