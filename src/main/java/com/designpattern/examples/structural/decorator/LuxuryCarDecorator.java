package com.designpattern.examples.structural.decorator;

public class LuxuryCarDecorator extends CarDecorator {

	public LuxuryCarDecorator(ICar car) {
		super(car);
	}

	@Override
	public void decorate() {
		super.decorate();
		System.out.println("Adding Luxury to the car");
	}

}
