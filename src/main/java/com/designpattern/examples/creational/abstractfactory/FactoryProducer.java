package com.designpattern.examples.creational.abstractfactory;

public class FactoryProducer {

	public AbstractShapeFactory getFactory(String factoryType) {
		if (factoryType.equals("ShapeFactory")) {
			return new ShapeFactory();
		} else if (factoryType.equals("RoundShapeFactory")) {
			return new RoundShapeFactory();
		}
		return null;

	}
}
