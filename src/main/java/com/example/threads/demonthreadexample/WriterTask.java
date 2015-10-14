package com.example.threads.demonthreadexample;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/**
 * Created by krishna_hotha on 6/2/15 2015.
 */
public class WriterTask implements Runnable {

	private Deque<Event> eventDeque;

	public WriterTask(Deque<Event> eventDeque) {
		this.eventDeque = eventDeque;

	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			Event event = new Event();
			event.setDate(new Date());
			event.setEventType("My event");
            System.out.println("creating event");
            eventDeque.addFirst(event);

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
