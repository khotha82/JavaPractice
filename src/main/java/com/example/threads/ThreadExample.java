package com.example.threads;

/**
 * Created by krishna_hotha on 5/28/15 2015.
 */
public class ThreadExample implements Runnable {

	UnsafeSequence unsafeSequence;

	ThreadExample(UnsafeSequence unsafeSequence) {
		this.unsafeSequence = unsafeSequence;
	}

	public static void main(String[] args) {

		UnsafeSequence unsafeSequence = new UnsafeSequence();
		Thread thread = new Thread(new ThreadExample(unsafeSequence));
		Thread thread1 = new Thread(new ThreadExample(unsafeSequence));
		Thread thread2 = new Thread(new ThreadExample(unsafeSequence));

		thread.start();
		thread1.start();
		thread2.start();

	}

	@Override
	public void run() {

		while (unsafeSequence.getValue() < 1000) {
			System.out.println(Thread.currentThread() + " " + unsafeSequence.getValue());
		}
	}
}
