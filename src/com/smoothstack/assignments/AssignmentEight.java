/**
 * 
 */
package com.smoothstack.assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentEight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 0) {

			String character = args[0];

			char[] chars = character.toCharArray();
			if (Character.isLetter(chars[0])) {
				AssignmentEight characterCounter = new AssignmentEight();
				characterCounter.readingCharacters(Character.toLowerCase(chars[0]));
			} else {
				System.out.println("Input a letter!");
			}
		} else {
			System.out.println("Please input a letter in your arguement.");
		}
	}
	
	public void readingCharacters(char character) {
		try(FileReader in = new FileReader("src/resources/textToRead.txt")) {
			int counter = 0;
			
			int c;
			while ((c=in.read()) != -1) {
				char compare = Character.toLowerCase((char) c);
				if (character == compare) {
					counter++;
				}
				System.out.print((char) c);
			}
			
			System.out.printf("\nTotal number of times your character appeared: %d", counter);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
