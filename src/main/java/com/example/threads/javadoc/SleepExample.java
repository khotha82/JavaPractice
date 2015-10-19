package com.example.threads.javadoc;

/**
 * Created by krishna_hotha on 8/11/15 2015.
 */
public class SleepExample {

	static void printMessage(String message) {

		String threadName =
				Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}

	public static void main(String[] args) throws InterruptedException {

		long patience = 1;

		printMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();

		printMessage("Waiting for MessageLoop thread to finish");
		// loop until MessageLoop
		// thread exits
		while (t.isAlive()) {
			printMessage("Still waiting...");
			// Wait maximum of 1 second
			// for MessageLoop thread
			// to finish.
			t.join(1000);
			if (((System.currentTimeMillis() - startTime) > patience)
					&& t.isAlive()) {
				printMessage("Tired of waiting!");
				t.interrupt();
				// Shouldn't be long now
				// -- wait indefinitely
				t.join();
			}
		}
		printMessage("Finally!");
	}

	private static class MessageLoop implements Runnable {

		@Override
		public void run() {

			String importantInfo[] = {
					"Mares eat oats",
					"Does eat oats",
					"Little lambs eat ivy",
					"A kid will eat ivy too"
			};
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					// Pause for 4 seconds
					Thread.sleep(4000);
					// Print a message
					printMessage(importantInfo[i]);
				}
			} catch (InterruptedException e) {
				printMessage("I wasn't done!");
			}
		}
	}
}
