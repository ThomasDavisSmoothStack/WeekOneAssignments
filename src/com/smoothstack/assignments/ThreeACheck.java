/**
 * 
 */
package com.smoothstack.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kealldin
 *
 */
public class ThreeACheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strArray = Arrays.asList("test", "aaa", "abc", "mad", "maid", "max", "Alpha");

		List<String> newArr = threeA(strArray);
		newArr.forEach(System.out::println);
	}

	public static List<String> threeA(List<String> strArray) {
		List<String> newArray = strArray.stream().filter(s -> s.startsWith("a") && s.length() == 3)
				.collect(Collectors.toList());

		return newArray;
	}

}
