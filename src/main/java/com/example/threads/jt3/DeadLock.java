package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/24/15 2015.
 */
public class DeadLock {

	private String objectId;

	public DeadLock(String objectId) {

		this.objectId = objectId;
	}

	public static void print(String msg) {

		System.out.println(Thread.currentThread().getName() + " " + msg);
	}

	public static void main(String[] args) throws InterruptedException {

		DeadLock object1 = new DeadLock("object1");
		DeadLock object2 = new DeadLock("object2");

		Thread t = new Thread(() -> {

			object1.checkOther(object2);
		}, "Thread1");

		Thread t1 = new Thread(() -> {
			object2.checkOther(object1);
		}, "Thread2");
		t.start();

		Thread.sleep(100);
		t1.start();
	}

	public synchronized void checkOther(DeadLock other) {

		print("entering checkother with object Id" + objectId);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		other.action();

		print("levling checkother with object Id" + objectId);
	}

	public synchronized void action() {

		print("entering action" + objectId);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		print("leving action" + objectId);
	}
}
