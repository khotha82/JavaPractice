package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/19/15 2015.
 */
public class DirtyRead {

	private String firstName;

	private String lastName;

	public static void print(String msg) {

		System.out.println(Thread.currentThread().getName() + " " + msg);
	}

	public static void main(String[] args) throws InterruptedException {

		DirtyRead corruptWrite = new DirtyRead();
		corruptWrite.setNames("Arnavd", "Pranav");

		new Thread(() -> {
			corruptWrite.setNames("Krishna", "Hotha");
		}, "ThreadA").start();

		Thread.sleep(200);
		new Thread(() -> {
			print(corruptWrite.getNames());
		}, "Threadb").start();
	}

	public void setNames(String firstName, String lastName) {

		synchronized (this) {
			this.firstName = firstName;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			this.lastName = lastName;

			print("Leaving setName FirstName" + this.firstName + "LastName " + this.lastName);
		}
	}

	public String getNames() {
		synchronized (this) {

		}
		return " " + firstName + " " + lastName;
	}
}
