/**
 * 
 */
package com.smoothstack.assignments;

/**
 * @author Thomas Davis
 *
 */
public class Triangle implements Shape{
	public float height = 0;
	public float base = 0;
	public float area = 0;
	
	Triangle(float h, float b) {
		height = h;
		base = b;
	}
	
	@Override
	public void calculateArea() {
		 area = (height * base) / 2;
	}

	@Override
	public void display() {
		System.out.println(area);
	}

}
