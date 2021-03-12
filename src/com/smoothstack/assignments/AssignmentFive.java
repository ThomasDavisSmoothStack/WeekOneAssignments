/**
 * 
 */
package com.smoothstack.assignments;


/**
 * @author Thomas Davis
 *
 */
public class AssignmentFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(8, 8);
		Circle circ = new Circle(4);
		Triangle tri = new Triangle(3, 5);
		rect.calculateArea();
		circ.calculateArea();
		tri.calculateArea();
		rect.display();
		circ.display();
		tri.display();
	}

}
