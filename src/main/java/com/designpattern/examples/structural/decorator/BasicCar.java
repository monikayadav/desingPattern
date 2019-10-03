package com.designpattern.examples.structural.decorator;

public class BasicCar implements ICar {

	@Override
	public void decorate() {
		System.out.println("This is a basic car");
	}

}
