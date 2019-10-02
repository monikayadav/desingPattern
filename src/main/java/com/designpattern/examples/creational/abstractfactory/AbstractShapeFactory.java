package com.designpattern.examples.creational.abstractfactory;

public abstract class AbstractShapeFactory {

	abstract IShape getShape(String shapeType);
}
