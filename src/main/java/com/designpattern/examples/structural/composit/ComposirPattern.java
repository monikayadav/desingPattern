package com.designpattern.examples.structural.composit;

/**
 * When we need to create a structure in a way that the objects in the structure
 * has to be treated the same way, we can apply composite design pattern.
 * 
 * @author Monika
 *
 */
public class ComposirPattern {
	public static void main(String[] args) {
		IShape square = new Square();
		IShape circle = new Circle();
		Drawing draw = new Drawing();
		draw.setShape(square);
		draw.setShape(circle);

		draw.getType();
	}

}
