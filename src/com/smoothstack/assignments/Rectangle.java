/**
 * 
 */
package com.smoothstack.assignments;

/**
 * @author Thomas Davis
 *
 */
public class Rectangle implements Shape{
	public float height = 0;
	public float width = 0;
	public float area = 0;
	
	Rectangle(float h, float w) {
		height = h;
		width = w;
	}
	
	@Override
	public void calculateArea() {
		 area = width * height;
	}

	@Override
	public void display() {
		System.out.println(area);
	}

}
