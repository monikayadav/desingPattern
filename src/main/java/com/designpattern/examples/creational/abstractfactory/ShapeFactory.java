package com.designpattern.examples.creational.abstractfactory;

import com.designpattern.examples.creational.abstractfactory.IShape;
import com.designpattern.examples.creational.abstractfactory.Square;
import com.designpattern.examples.creational.abstractfactory.Triangle;

public class ShapeFactory extends AbstractShapeFactory {
	@Override
	public IShape getShape(String shapeType) {
		if (shapeType.equals("Square")) {
			return new Square();
		} else if (shapeType.equals("Triangle")) {
			return new Triangle();
		}
		return null;
	}

}
