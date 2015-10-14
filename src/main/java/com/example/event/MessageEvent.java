package com.example.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class MessageEvent extends ApplicationEvent {

    private String message;

    public MessageEvent(Object source,String message) {
        super(source);
        this.message=message;
    }


    public String getMessage() {
        return message;
    }

}
