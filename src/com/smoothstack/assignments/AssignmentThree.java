/**
 * 
 */
package com.smoothstack.assignments;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Double sum = (double) 0;
			for(String num : args) {
				Double convertedNum = Double.parseDouble(num);
				sum += convertedNum;
			}
			System.out.printf("The Sum of your numbers are: %.2f\n", sum);
		}
		catch (Exception e){
			System.out.println("Error: Non-number found!");
			System.out.println(e);
		}
	}

}
