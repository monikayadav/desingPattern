package com.designpattern.examples.creational.abstractfactory;

public class RoundShapeFactory extends AbstractShapeFactory {

	@Override
	IShape getShape(String shapeType) {
		if (shapeType.equals("RoundSquare")) {
			return new RoundSquare();
		} else if (shapeType.equals("RoundTriangle")) {
			return new RoundTriangle();
		}
		return null;
	}

}
