/**
 * 
 */
package com.smoothstack.assignments;

import java.util.Scanner;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		int randomNumber = (int)(Math.random() * (max - min + 1) + min);
		int randomNumberUpperBound = randomNumber + 10;
		int randomNumberLowerBound = randomNumber - 10;
		int numberOfGuesses = 0;
		Scanner scan = new Scanner(System.in);
		
		while(numberOfGuesses < 5) {
			System.out.print("Pick a number 1-100: ");
			int guess = scan.nextInt();
			
			if (guess < 1 || guess > 100) {
				System.out.println("You need to pick a number between 1-100!");
			} else {
				if (guess > randomNumberLowerBound && guess < randomNumberUpperBound) {
					System.out.printf("You are close enough!  The random number is: %d\n", randomNumber);
					break;
				} else {
					numberOfGuesses++;
					if (numberOfGuesses >= 5) {
						System.out.printf("Sorry, you lose!  The random number is: %d\n", randomNumber);
					} else {
						System.out.println("You are not close enough!  Try again.");	
					}					
				}
			}
		}
		

		scan.close();
	}

}
