package com.designpattern.examples.creational.factory;

/**
 * The Factory Design Pattern or Factory Method Design Pattern is one of the
 * most used design patterns in Java.
 * 
 * According to GoF, this pattern "defines an interface for creating an object,
 * but let subclasses decide which class to instantiate. The Factory method lets
 * a class defer instantiation to subclasses".
 * 
 * This pattern delegates the responsibility of initializing a class from the
 * client to a particular factory class by creating a type of virtual
 * constructor.
 * 
 * To achieve this, we rely on a factory which provides us with the objects,
 * hiding the actual implementation details. The created objects are accessed
 * using a common interface.
 * 
 * @author Monika.Yadav
 *
 */
public class FactoryDesignPattern {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		IShape shape = shapeFactory.getShapeInstance("Square");
		if (shape != null) {
			System.out.println(shape.getType());
		}
		shape = shapeFactory.getShapeInstance("Triangle");
		if (shape != null) {
			System.out.println(shape.getType());
		}
		shape = shapeFactory.getShapeInstance("Circle");
		if (shape != null) {
			System.out.println(shape.getType());
		}
	}
}
