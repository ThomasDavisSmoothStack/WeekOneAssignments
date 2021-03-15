/**
 * 
 */
package com.smoothstack.weekone.project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thomas Davis
 *
 */
public class RecursiveIntAdding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> intArray = new ArrayList<>();
		try {
			for (int i = 0; i < args.length; i++) {
				intArray.add(Integer.parseInt(args[i]));
			}

		} catch (Exception e) {

		}
	}

//	public static Integer addUp(List<Integer> i, int n) {
//		if (i.get(n).equals(i.get(n+1))) {
//			return i.get(n) + addUp(i, n+1);
//		}
//	}

}
