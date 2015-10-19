package com.example.threads;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by krishna_hotha on 6/2/15 2015.
 */
public class UnsafeTask implements Runnable {

	private static ThreadLocal<Date> date = new
			ThreadLocal<Date>() {
				protected Date initialValue() {
					return new Date();
				}
			};

	public static void main(String[] args) {

		UnsafeTask task = new UnsafeTask();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(task);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {

		System.out.println("Current Thread" + Thread.currentThread().getId() + " " + date.get());

		try {
			TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current Thread Finished" + Thread.currentThread().getId() + " " + date.get());
	}
}
