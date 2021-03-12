/**
 * 
 */
package com.smoothstack.assignments;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Thomas Davis
 *
 */
public class ProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set size of buffer to produce/consume
		Buffer buffer = new Buffer(5);
		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					buffer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					buffer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		try {
			producer.start();
			consumer.start();

			producer.join();
			consumer.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static class Buffer {

		private Queue<Integer> list;
		private int size;

		public Buffer(int size) {
			this.list = new LinkedList<>();
			this.size = size;
		}

		public void produce() throws InterruptedException {
			int value = 0;
			while (true) {
				synchronized (this) {
					while (list.size() >= size) {
						wait();
					}

					list.add(value);
					System.out.println("Produced " + value);
					value++;

					notify();
					Thread.sleep(100);
				}
			}
		}

		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					while (list.size() == 0) {
						wait();
					}

					int value = list.poll();

					System.out.println("Consume " + value);

					notify();
					Thread.sleep(100);
				}
			}
		}
	}
}
