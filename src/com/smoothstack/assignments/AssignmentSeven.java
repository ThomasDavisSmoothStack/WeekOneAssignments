/**
 * 
 */
package com.smoothstack.assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter text to input into the File: ");
		String textToAppend = scan.nextLine();

		String filename = "src/resources/text.txt";
		Path pathToFile = Paths.get(filename);
		System.out.println(pathToFile.toAbsolutePath());
		AssignmentSeven test = new AssignmentSeven();
		test.appendToFile(textToAppend, pathToFile);
	}

	public void appendToFile(String data, Path pathToFile) {
		try {
			System.out.println("Writing to file...");
			Files.write(pathToFile, data.getBytes(), StandardOpenOption.APPEND);
			System.out.println("Success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
