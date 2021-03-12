/**
 * 
 */
package com.smoothstack.assignments;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer[]> rows = new ArrayList<>();
		rows.add(new Integer[] {1, 13, 3});
		rows.add(new Integer[] {3, 8, 1});
		rows.add(new Integer[] {5, 4, 9});
		rows.add(new Integer[] {3, 2, 6});
		
		int maxNum = 0;
		int posX = 0;
		int posY = 0;
		
		for (Integer[] row : rows) {
			//System.out.println(Arrays.toString(row));
			int count = 0;
			for (int i : row) {
				System.out.printf("i: %d\n" , i);
				if (i > maxNum) {
					maxNum = i;
					System.out.printf("maxNum: %d\n", maxNum);
					posX = count;
					posY = rows.indexOf(row);
				}
				count++;
			}
		}
		
		System.out.printf("Highest number: %d, Located in: %d, %d", maxNum, posX, posY);
	}

}
