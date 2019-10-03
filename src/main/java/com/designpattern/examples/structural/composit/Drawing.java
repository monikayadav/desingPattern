package com.designpattern.examples.structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements IShape {
	private List<IShape> shapeList = new ArrayList<IShape>();

	public void setShape(IShape shape) {
		shapeList.add(shape);
	}

	@Override
	public void getType() {
		System.out.println("This is a drawing");
		for (IShape shape : shapeList) {
			shape.getType();
		}
	}

}
