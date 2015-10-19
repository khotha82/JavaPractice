package com.example.threads.jt3;

import java.awt.*;
import java.text.DecimalFormat;

import javax.swing.*;

/**
 * Created by krishna_hotha on 8/12/15 2015.
 */
public class SecondCounter extends JComponent {

	private boolean keepRunning;
	private Font paintFont;
	private String timeMsg;
	private int arcLen;

	public SecondCounter() {

		paintFont = new Font("SansSerif", Font.BOLD, 14);
		arcLen = 0;
		timeMsg = "Never Started";
	}

	public void runClock() {
		System.out.println("thread running runClock() is " + Thread.currentThread().getName());

		DecimalFormat fmt = new DecimalFormat("0.000");
		long normalSleepTime = 100;

		int counter = 0;
		keepRunning = true;

		while (keepRunning) {
			try {
				Thread.sleep(normalSleepTime);
			} catch (InterruptedException x) {
				// ignore
			}

			counter++;
			double counterSecs = counter / 10.0;

			timeMsg = fmt.format(counterSecs);

			arcLen = (((int) counterSecs) % 60) * 360 /
					60;
			repaint();
		}
	}

	public void stopClock() {
		keepRunning = false;
	}

	@Override
	public void paint(Graphics g) {

		System.out.println("thread that invoked paint() is " + Thread.currentThread().getName());

		g.setColor(Color.black);
		g.setFont(paintFont);
		g.drawString(timeMsg, 0, 15);

		g.fillOval(0, 20, 100, 100); // black border

		g.setColor(Color.white);
		g.fillOval(3, 23, 94, 94); // white for unused

		g.setColor(Color.blue); // blue for used portion
		g.fillArc(2, 22, 96, 96, 90, -arcLen);
	}
}
