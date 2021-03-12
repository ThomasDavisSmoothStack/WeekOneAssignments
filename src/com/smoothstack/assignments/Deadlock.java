package com.smoothstack.assignments;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 */

/**
 * @author Thomas Davis
 *
 */
public class Deadlock {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lock r1 = new ReentrantLock(true);
		Lock r2 = new ReentrantLock(true);

		System.out.println("Running Program...");
		Runnable thread1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (r1) {
						System.out.println("r1 Taken, waiting for r2...");
						Thread.sleep(50);
						synchronized (r2) {
							System.out.println("r2 Taken!");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Runnable thread2 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (r2) {
						System.out.println("r2 Taken, waiting for r1...");
						Thread.sleep(50);
						synchronized (r1) {
							System.out.println("r1 Taken!");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(thread1).start();
		new Thread(thread2).start();
		System.out.println("End of program...");
	}

}
