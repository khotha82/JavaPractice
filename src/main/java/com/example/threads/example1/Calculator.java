package com.example.threads.example1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by krishna_hotha on 5/28/15 2015.
 */
public class Calculator implements Runnable {

	private int i;

	public Calculator(int i) {
		this.i = i;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i * 10 + " " + Thread.currentThread());
		}
	}

	private static void writeThreadInfo(PrintWriter pw, Thread
			thread, Thread.State state) {
		pw.printf("Main : Id %d - %s\n", thread.getId(), thread.getName());
		pw.printf("Main : Priority: %d\n", thread.getPriority());
		pw.printf("Main : Old State: %s\n", state);
		pw.printf("Main : New State: %s\n", thread.getState());
		pw.printf("Main : ************************************\n");
        pw.flush();
	}

	public static void main(String[] args) throws IOException {

		Thread[] threads = new Thread[10];
		Thread.State[] states = new Thread.State[10];

        PrintWriter printWriter=new PrintWriter(new FileWriter("logssss.txt"));

		for (int i = 0; i < 10; i++) {

			Calculator c = new Calculator(i);
			threads[i] = new Thread(c);
			if (i % 2 == 0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			}
			else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			states[i] = threads[i].getState();

            writeThreadInfo(printWriter,threads[i],threads[i].getState());
		}
        for(int i=0;i<10;i++){
            threads[i].start();
        }
        boolean finish=false;
        while (!finish) {
            for (int i=0; i<10; i++){
                if (threads[i].getState()!=states[i]) {
                    writeThreadInfo(printWriter, threads[i],states[i]);
                    states[i]=threads[i].getState();
                }
            }
            finish=true;
            for (int i=0; i<10; i++){
                finish=finish &&(threads[i].getState()== Thread.State.TERMINATED);
            }
        }
        printWriter.flush();
        printWriter.close();
	}

}
