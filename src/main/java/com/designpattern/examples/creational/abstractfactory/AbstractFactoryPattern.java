package com.designpattern.examples.creational.abstractfactory;

/**
 * In the previous section, we saw how the Factory Method design pattern could
 * be used to create objects related to a single family.
 * 
 * By contrast, the Abstract Factory Design Pattern is used to create families
 * of related or dependent objects. It's also sometimes called a factory of
 * factories.
 * 
 * @author Monika.Yadav
 *
 */

public class AbstractFactoryPattern {

	public static void main(String[] agrs) {
		FactoryProducer factoryProducer = new FactoryProducer();
		IShape shape1 = factoryProducer.getFactory("ShapeFactory").getShape("Square");
		IShape shape2 = factoryProducer.getFactory("ShapeFactory").getShape("Triangle");
		IShape shape3 = factoryProducer.getFactory("RoundShapeFactory").getShape("RoundSquare");
		IShape shape4 = factoryProducer.getFactory("RoundShapeFactory").getShape("RoundTriangle");
		System.out.println(shape1.getShapeType());
		System.out.println(shape2.getShapeType());
		System.out.println(shape3.getShapeType());
		System.out.println(shape4.getShapeType());
	}
}
