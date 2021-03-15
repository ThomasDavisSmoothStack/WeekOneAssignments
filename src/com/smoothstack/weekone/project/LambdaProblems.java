/**
 * 
 */
package com.smoothstack.weekone.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Thomas Davis
 *
 */
public class LambdaProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("src/resources/inputStub.txt");
		Scanner scan;
		try {
			scan = new Scanner(file);

			Integer i = Integer.parseInt(scan.nextLine());
			for (Integer k = 0; k < i; k++) {
				String[] strs = scan.nextLine().trim().split(" ");
				switch (Integer.parseInt(strs[0])) {
				case 1:
					isOdd(Integer.parseInt(strs[1]));
					break;
				case 2:
					isPrime(Integer.parseInt(strs[1]));
					break;
				case 3:
					isPalindrome(Integer.parseInt(strs[1]));
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Please ensure only integers are provided.");
			e.printStackTrace();
		}
	}

	public static boolean isOdd(Integer i) {
		int check = i % 2;
		if (check == 0) {
			System.out.println("EVEN");
			return true;
		} else {
			System.out.println("ODD");
			return false;
		}
	}

	public static boolean isPrime(Integer i) {
		boolean primeFlag = false;

		for (int k = 2; k < i / 2; k++) {
			if (i % k == 0) {
				primeFlag = true;
				break;
			}
		}

		if (!primeFlag && i > 0) {
			System.out.println("PRIME");
			return true;
		} else {
			System.out.println("COMPOSITE");
			return false;
		}
	}

	public static boolean isPalindrome(Integer i) {
		Integer reversedNumber = 0;
		Integer remainder = 0;
		Integer originalNumber = i;

		while (i != 0) {
			remainder = i % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			i /= 10;
		}

		if (originalNumber.equals(reversedNumber)) {
			System.out.println("PALINDROME");
			return true;
		} else {
			System.out.println("NOT PALINDROME");
			return false;
		}
	}

}
