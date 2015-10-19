package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/13/15 2015.
 */
public class BothInMethod {

	private String objectId;
	private int num;

	public BothInMethod(String objectId) {
		this.objectId = objectId;
	}

	public static void main(String[] args) throws InterruptedException {

		final BothInMethod bothInMethod = new BothInMethod("obj1");

		Thread threadA = new Thread(() -> {
			bothInMethod.doStuff(3);
		}, "Thread A");

		threadA.start();

		Thread.sleep(2000);

		Thread threadB = new Thread(() -> {
			bothInMethod.doStuff(7);
		}, "Thread B");
		threadB.start();
	}

	public void doStuff(int val) {
		System.out.println(objectId + " " + Thread.currentThread().getName() + " " + "Entering do stuff");
		num = val * 2 + objectId.length();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("local varibale num" + num);
		System.out.println(Thread.currentThread().getName() + "leaving do stuff " + objectId);

	}
}
