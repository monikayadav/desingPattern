package com.designpattern.examples.structural.decorator;

/**
 * Decorator design pattern is used to modify the functionality of an object at
 * runtime. At the same time other instances of the same class will not be
 * affected by this, so individual object gets the modified behavior
 * 
 * @author Monika
 *
 */

public class DecoratorPattern {
	public static void main(String[] args) {
		ICar sportsCar = new SprotsCarDecorator(new BasicCar());
		sportsCar.decorate();

		System.out.println("****************************************");

		ICar luxurySportsCar = new LuxuryCarDecorator(new SprotsCarDecorator(new BasicCar()));
		luxurySportsCar.decorate();

	}

}
