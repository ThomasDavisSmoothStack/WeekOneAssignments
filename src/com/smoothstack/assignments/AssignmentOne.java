/**
 * 
 */
package com.smoothstack.assignments;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printHalfTower();
		System.out.println();
		printHalfTowerReverse();
		System.out.println();
		printTower();
		System.out.println();
		printTowerReverse();
	}
	
	static void printHalfTower() {
		String str = "******";
		for (int i = 1; i < 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("...........");
	}
	
	static void printHalfTowerReverse() {
		System.out.println("...........");
		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

	static void printTower() {
	    int number = 4;
	    int count = number - 1;
	    for (int k = 1; k <= number; k++) {
	    	System.out.print("  ");
	    	for (int i = 1; i <= count; i++) {
	    		System.out.print(" ");
	    	}
	    	count--;
	    	for (int i = 1; i <= 2 * k - 1; i++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }

		System.out.println("...........");
	}
	
	static void printTowerReverse() {
		System.out.println("...........");
	    int number = 3;
	    int count = number - 1;
	    for (int k = 4; k >= 1; k--) {
	    	for (int i = 1; i <= count; i++) {
	    		System.out.print(" ");
	    	}
	    	count++;
	    	for (int i = 1; i <= 2 * k - 1; i++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	}
}
