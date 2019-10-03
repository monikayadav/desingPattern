package com.designpattern.examples.behavioral.chainofresponsibility;

/**
 * Chain of responsibility pattern is used to achieve loose coupling in software
 * design where a request from client is passed to a chain of objects to process
 * them. Then the object in the chain will decide themselves who will be
 * processing the request and whether the request is required to be sent to the
 * next object in the chain or not.
 * 
 * @author Monika.Yadav
 *
 */
public class ChainOfResponsibilityPattern {

	public static void main(String[] agrs) {
		ICurrencyDispenser c1 = new Dollar50Dispenser();
		ICurrencyDispenser c2 = new Dollar20Dispenser();
		ICurrencyDispenser c3 = new Dollar10Dispenser();
		c1.setNextChain(c2);
		c2.setNextChain(c3);

		Currency currency = new Currency(80);
		if (currency.getAmount() % 10 == 0) {
			c1.dispense(currency);
		}
	}

}
