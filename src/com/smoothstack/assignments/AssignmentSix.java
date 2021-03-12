/**
 * 
 */
package com.smoothstack.assignments;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Thomas Davis
 *
 */
public class AssignmentSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path dir = Paths.get(args[0]);
		try {
			Files.walk(dir).forEach(path -> showFile(path.toFile()));
		} catch (IOException e) {
			System.out.println("This is not a valid path!");
		}
	}
	
	public static void showFile(File file) {
		System.out.println(file.getAbsolutePath());
	}

}
