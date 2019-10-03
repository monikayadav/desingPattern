package com.designpattern.examples.structural.decorator;

public class CarDecorator implements ICar {
	private ICar car;

	public CarDecorator(ICar car) {
		this.car = car;
	}

	@Override
	public void decorate() {
		car.decorate();
	}

	public ICar getCar() {
		return car;
	}
}
