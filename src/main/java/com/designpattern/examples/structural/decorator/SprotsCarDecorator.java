package com.designpattern.examples.structural.decorator;

public class SprotsCarDecorator extends CarDecorator {

	public SprotsCarDecorator(ICar car) {
		super(car);
	}

	@Override
	public void decorate() {
		super.decorate();
		System.out.println("Adding sports feature car");
	}

}
