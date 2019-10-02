package com.designpattern.examples.creational.factory;

public class ShapeFactory {
	IShape getShapeInstance(String shapeType) {
		if (shapeType.equals("Square")) {
			return new Square();
		} else if (shapeType.equals("Triangle")) {
			return new Triangle();
		} else if (shapeType.equals("Circle")) {
			return new Circle();
		}
		return null;
	}

}
