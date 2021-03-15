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
public class RemoveXFromStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strArray = new ArrayList<>();
		try {
			for (int i = 0; i < args.length; i++) {
				strArray.add(args[i]);
			}
			List<String> noXArray = removeAllX(strArray);
			System.out.println("removeAllX: ");
			noXArray.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<String> removeAllX(List<String> s) {
		s = s.stream().map(str -> str.replace("x", "")).collect(Collectors.toList());
		return s;
	}

}
