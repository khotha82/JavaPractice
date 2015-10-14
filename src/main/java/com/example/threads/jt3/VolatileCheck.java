package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/13/15 2015.
 */
public class VolatileCheck implements Runnable {

	private int value;
	private  volatile boolean missedIt;
	private    long creationTime;

	public VolatileCheck() {
		this.value = 10;
		this.missedIt = false;
		this.creationTime = System.currentTimeMillis();
	}

	private void print(String msg) {
		// This method could have been simplified by using
		// functionality present in the java.text package,
		// but did not take advantage of it since that
		// package
		// is not present in JDK1.0.

		long interval = System.currentTimeMillis() -
				creationTime;

		String tmpStr = " " + (interval / 1000.0) + "000";

		int pos = tmpStr.indexOf(".");
		String secStr = tmpStr.substring(pos - 2, pos + 4);

		String nameStr = " " +
				Thread.currentThread().getName();



		System.out.println(secStr + " " + nameStr + " " +
				msg);
	}

	@Override
	public void run() {

		print("entering run()");

		while (value < 20) {
			if (missedIt) {
				int currValue = value;
				Object lock = new Object();

				synchronized (lock) {

				}
				int valueAfterSync = value;
				System.out.println("ding dong ding");
				print("in run() - see value=" + currValue + ". but rumor has it that it changed!");
				print("in run() - valueAfterSync=" + valueAfterSync);

				break;
			}

		}
		System.out.println(missedIt+"  "+value);
		print("leaving run()");
	}

	public void workMethod() throws InterruptedException {
		print("entering workMethod()");

		print("in workMethod() - about to sleep for 2	seconds");
		Thread.sleep(2000);
		System.out.println("setting value");
		value = 50;
		print("in workMethod() - just set value=" + value);

		print("in workMethod() - about to sleep for 5	seconds");
		Thread.sleep(5000);

		missedIt = true;
		print("in workMethod() - just set missedIt=" +
				missedIt);

		print("in workMethod() - about to sleep for 3		seconds");
		Thread.sleep(3000);

		print("leaving workMethod()");

	}

	public static void main(String[] args) throws InterruptedException {

		VolatileCheck volatileCheck=new VolatileCheck();
		Thread.sleep(100);
		Thread t=new Thread(volatileCheck);
		t.start();
		Thread.sleep(100);
		volatileCheck.workMethod();
	}
}
