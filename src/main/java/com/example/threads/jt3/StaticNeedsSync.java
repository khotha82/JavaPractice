package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/19/15 2015.
 */
public class StaticNeedsSync {

	private static int nextSerialNumber = 10001;

	public static synchronized int getNextSerialNumber() {

		int sn = nextSerialNumber;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nextSerialNumber++;
		return sn;
	}

	public static void print(String msg) {

		System.out.println(Thread.currentThread().getName() + " " + msg);
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable r = () -> {
			print("next serial number" + getNextSerialNumber());
		};
		Thread threadA = new Thread(r, "Thread A");
		threadA.start();
		Thread.sleep(1500);

		Thread threadB = new Thread(r, "Thread B");
		threadB.start();
		Thread.sleep(500);

		Thread threadC = new Thread(r, "Thread C");
		threadC.start();
		Thread.sleep(2500);

		Thread threadD = new Thread(r, "Thread D");
		threadD.start();

	}
}
