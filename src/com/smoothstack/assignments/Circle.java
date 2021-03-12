/**
 * 
 */
package com.smoothstack.assignments;

/**
 * @author Thomas Davis
 *
 */
public class Circle implements Shape{
	public float radius = 0;
	public double area = 0;
	
	Circle(float r) {
		radius = r;
	}
	
	@Override
	public void calculateArea() {
		 area = Math.PI * (radius * radius);
	}

	@Override
	public void display() {
		System.out.println(area);
	}

}
