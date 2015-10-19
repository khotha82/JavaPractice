package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/13/15 2015.
 */
public class ThreadSetPriority {

	public static Runnable makeRunnable() {

		Runnable r = () -> {

			for (int i = 0; i < 5; i++) {

				System.out.println("in run proority" + Thread.currentThread().getPriority() + " " + Thread.currentThread().getName());

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		return r;
	}

	public static void main(String[] args) throws InterruptedException {

		Thread threadA = new Thread(makeRunnable(), "ThreadA");
		threadA.setPriority(8);
		threadA.start();

		Thread threadB = new Thread(makeRunnable(), "Threadb");
		threadB.setPriority(2);
		threadB.start();

		System.out.println("in main proority" + Thread.currentThread().getPriority() + " " + Thread.currentThread().getName());
		Thread.sleep(3000);
		threadA.setPriority(3);
		System.out.println("in main proority" + threadA.getPriority() + " " + threadA.getName());
	}
}
