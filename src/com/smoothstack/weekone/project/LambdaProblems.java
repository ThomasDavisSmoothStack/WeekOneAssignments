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
	interface PerformOperation {
		boolean isCorrect(Integer i);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaProblems newProbs = new LambdaProblems();
		File file = new File("src/resources/inputStub.txt");
		try {
			Scanner scan = new Scanner(file);

			Integer i = Integer.parseInt(scan.nextLine());
			for (Integer k = 0; k < i; k++) {
				String[] strs = scan.nextLine().trim().split(" ");
				switch (Integer.parseInt(strs[0])) {
				case 1:
					System.out.println(check(newProbs.isOddish(), Integer.parseInt(strs[1])) ? "ODD" : "EVEN");
					break;
				case 2:
					System.out.println(check(newProbs.isPrimeish(), Integer.parseInt(strs[1])) ? "PRIME" : "COMPOSITE");
					break;
				case 3:
					System.out.println(check(newProbs.isPalindromeish(), Integer.parseInt(strs[1])) ? "PALINDROME"
							: "NOT PALINDROME");
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Please ensure only integers are provided.");
			e.printStackTrace();
		}
	}

	public PerformOperation isOddish() {
		return i -> i % 2 != 0;
	}

	public PerformOperation isPrimeish() {
		return i -> {
			boolean primeFlag = true;

			if (i < 2) {
				primeFlag = false;
			} else {
				for (int k = 2; k <= i / 2; k++) {
					if (i % k == 0) {
						primeFlag = false;
						break;
					}
				}
			}

			return primeFlag;
		};
	}

	public PerformOperation isPalindromeish() {
		return i -> {
			Integer reversedNumber = 0;
			Integer remainder = 0;
			Integer originalNumber = i;

			while (i != 0) {
				remainder = i % 10;
				reversedNumber = reversedNumber * 10 + remainder;
				i /= 10;
			}

			if (originalNumber.equals(reversedNumber)) {
				return true;
			} else {
				return false;
			}
		};
	}

	public static boolean check(PerformOperation performOperation, int num) {
		return performOperation.isCorrect(num);
	}
}
