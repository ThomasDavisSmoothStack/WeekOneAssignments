package com.smoothstack.weekone.project;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.smoothstack.weekone.project.LambdaProblems.PerformOperation;

public class LambdaProblemsTest {
	private static LambdaProblems lamb = new LambdaProblems();

	public static boolean check(PerformOperation performOperation, int num) {
		return performOperation.isCorrect(num);
	}

	@Test
	public void isOddTest() {
		assertTrue(check(lamb.isOddish(), 1));
		assertTrue(check(lamb.isOddish(), 3));
		assertTrue(check(lamb.isOddish(), -1));
		assertFalse(check(lamb.isOddish(), 0));
		assertFalse(check(lamb.isOddish(), 4));
	}

	@Test
	public void isPrimeTest() {
		assertTrue(check(lamb.isPrimeish(), 3));
		assertTrue(check(lamb.isPrimeish(), 5));
		assertFalse(check(lamb.isPrimeish(), 4));
		assertFalse(check(lamb.isPrimeish(), -1));
		assertFalse(check(lamb.isPrimeish(), 0));
	}

	@Test
	public void isPalindrome() {
		assertTrue(check(lamb.isPalindromeish(), 555));
		assertTrue(check(lamb.isPalindromeish(), 9009));
		assertFalse(check(lamb.isPalindromeish(), 1234));
		assertFalse(check(lamb.isPalindromeish(), -3949));
	}
}
