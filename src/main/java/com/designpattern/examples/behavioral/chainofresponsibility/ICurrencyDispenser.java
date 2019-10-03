package com.designpattern.examples.behavioral.chainofresponsibility;

public interface ICurrencyDispenser {

	void dispense(Currency currency);
	void setNextChain(ICurrencyDispenser currencyDispenser);
}
