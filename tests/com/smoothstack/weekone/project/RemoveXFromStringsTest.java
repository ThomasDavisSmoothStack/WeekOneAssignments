package com.smoothstack.weekone.project;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveXFromStringsTest {
	RemoveXFromStrings a = new RemoveXFromStrings();

	List<String> strTest = Arrays.asList("xax", "abc");
	List<String> strTestTwo = Arrays.asList("xax", "123");
	List<String> expStrs = Arrays.asList("a", "abc");
	List<String> result = a.removeAllX(strTest);

	@Test
	public void testX() {
		assertEquals(expStrs, result);
	}

}