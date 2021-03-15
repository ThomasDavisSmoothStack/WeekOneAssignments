/**
 * 
 */
package com.smoothstack.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Thomas Davis
 *
 */
public class oddOrEvenIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> intArray = Arrays.asList(2, 19, 999, 34, 558, 22);
		List<String> strArray = new ArrayList<>();

		intArray.forEach(i -> {
			if (i % 2 == 0) {
				strArray.add("e" + i);
			} else {
				strArray.add("o" + i);
			}
		});

		String commaSeperated = String.join(",", strArray);
		System.out.println(commaSeperated);
	}

}
