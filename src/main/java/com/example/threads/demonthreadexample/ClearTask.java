package com.example.threads.demonthreadexample;

import java.util.Date;
import java.util.Deque;

/**
 * Created by krishna_hotha on 6/2/15 2015.
 */
public class ClearTask extends Thread {

	private Deque<Event> eventDeque;

	public ClearTask(Deque<Event> eventDeque) {
		this.eventDeque = eventDeque;
		setDaemon(true);

	}

	@Override
	public void run() {

		while (true) {
			Date date = new Date();
			clean(date);
		}

	}

	private void clean(Date date) {

		long difference;
		boolean delete;
		if (eventDeque.size() == 0) {
			return;
		}
		System.out.println("deleteing event");
		delete = false;
		do {
			Event e = eventDeque.getLast();
			difference = date.getTime() - e.getDate().getTime();
			if (difference > 100) {
				System.out.printf("Cleaner: %s\n", e.getEventType());
				eventDeque.removeLast();
				delete = true;
			}
		} while (difference > 100);
		if (delete) {
			System.out.printf("Cleaner: Size of the queue: %d\n", eventDeque.
					size());

		}

	}
}
