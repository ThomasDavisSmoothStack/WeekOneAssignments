/**
 * 
 */
package com.smoothstack.assignments;

/**
 * @author Thomas Davis
 *
 */
public class SingletonDoubleLock {
	private static volatile SingletonDoubleLock instance;

	public static SingletonDoubleLock getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleLock.class) {
				if (instance == null) {
					instance = new SingletonDoubleLock();
				}
			}
		}
		return instance;
	}
}
