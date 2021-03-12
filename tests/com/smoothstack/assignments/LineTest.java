package com.smoothstack.assignments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

/**
 * @author Thomas Davis
 *
 */
public class LineTest {
	private Line lineOne = new Line(1, 1, 4, 4);
	private Line lineTwo = new Line(0, 2, 0, 5);
	private Line lineThree = new Line(0, 3, 3, 6);
	private Line lineFour = new Line(3, 4, 8, 8);

	@Test
	public void slopeTest() {
		assertEquals(new Double(1), lineOne.getSlope(), 0.001);
	}

	@Test
	public void slopeExceptionTest() {
		Exception e = assertThrows(ArithmeticException.class, () -> {
			lineTwo.getSlope();
		});
		assertEquals(null, e.getMessage());
	}

	@Test
	public void getDistanceTest() {
		assertEquals(new Double(4.242), lineOne.getDistance(), 0.001);
	}

	@Test
	public void parallelTest() {
		assertEquals(new Boolean(true), lineOne.parallelTo(lineThree));
		assertEquals(new Boolean(false), lineOne.parallelTo(lineFour));
	}

	@Test
	public void parallelExceptionTest() {
		Exception e = assertThrows(ArithmeticException.class, () -> {
			lineTwo.parallelTo(lineOne);
		});
		assertEquals(null, e.getMessage());
	}
}
