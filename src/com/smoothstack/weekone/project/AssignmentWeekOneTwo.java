/**
 * 
 */
package com.smoothstack.weekone.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentWeekOneTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> intArray = new ArrayList<>();
		try {
			for (int i = 0; i < args.length; i++) {
				intArray.add(Integer.parseInt(args[i]));
			}
			List<Integer> rightArray = rightDigit(intArray);
			System.out.println("rightDigits: ");
			rightArray.forEach(System.out::println);

			List<Integer> multiTwoArray = multiplyByTwo(intArray);
			System.out.println("MultiplyByTwo: ");
			multiTwoArray.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static List<Integer> rightDigit(List<Integer> i) {
		i = i.stream().map(k -> k % 10).collect(Collectors.toList());
		return i;
	}

	public static List<Integer> multiplyByTwo(List<Integer> i) {
		i = i.stream().map(k -> k * 2).collect(Collectors.toList());
		return i;
	}
}
