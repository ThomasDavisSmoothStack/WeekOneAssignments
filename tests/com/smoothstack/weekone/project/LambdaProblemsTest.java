package com.smoothstack.weekone.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LambdaProblemsTest {
	private static LambdaProblems lamb = new LambdaProblems();

	@Test
	public void isOddTest() {
		assertEquals(new Boolean(true), lamb.isOdd(2));
		assertEquals(new Boolean(false), lamb.isOdd(1));
		assertEquals(new Boolean(true), lamb.isOdd(-2));
		assertEquals(new Boolean(true), lamb.isOdd(0));
	}

	@Test
	public void isPrimeTest() {
		assertEquals(new Boolean(true), lamb.isPrime(3));
		assertEquals(new Boolean(false), lamb.isPrime(6));
		assertEquals(new Boolean(true), lamb.isPrime(7));
		assertEquals(new Boolean(false), lamb.isPrime(-5));
	}

	@Test
	public void isPalindrome() {
		assertEquals(new Boolean(true), lamb.isPalindrome(5555));
		assertEquals(new Boolean(true), lamb.isPalindrome(9009));
		assertEquals(new Boolean(false), lamb.isPalindrome(1234));
		assertEquals(new Boolean(true), lamb.isPalindrome(0));
	}
}
