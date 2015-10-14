package com.example.threads.demonthreadexample;

import java.util.Date;

/**
 * Created by krishna_hotha on 6/2/15 2015.
 */
public class Event {

    private String eventType;
    private Date date;


    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
