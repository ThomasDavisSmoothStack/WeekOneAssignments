/**
 * 
 */
package com.smoothstack.assignments;

import java.util.Arrays;
import java.util.List;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentNine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String[] stringArray = new String[] {"test1", "testTwo", "testThree"};
		List<String> list = Arrays.asList("atest1", "dtoastTwo", "cTestThree", "ftoastfour");

		list.sort((a, b) -> a.length() - b.length());
		list.forEach(System.out::println);

		list.sort((a, b) -> b.length() - a.length());
		list.forEach(System.out::println);

		list.sort((a, b) -> a.charAt(0) - b.charAt(0));
		list.forEach(System.out::println);

		list.sort((a, b) -> {
			if (a.contains("e")) {
				return -1;
			} else {
				return 1;
			}
		});
		list.forEach(System.out::println);

		list.sort((a, b) -> containsE(a, b));
		list.forEach(System.out::println);
	}

	public static int containsE(String a, String b) {
		if (a.contains("e")) {
			return -1;
		} else {
			return 1;
		}
	}

}
