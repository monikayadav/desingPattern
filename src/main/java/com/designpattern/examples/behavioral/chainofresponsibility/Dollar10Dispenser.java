package com.designpattern.examples.behavioral.chainofresponsibility;

public class Dollar10Dispenser implements ICurrencyDispenser {

	ICurrencyDispenser chain;

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 10) {
			int num = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));

		} else {
			chain.dispense(currency);
		}

	}

	@Override
	public void setNextChain(ICurrencyDispenser currencyDispenser) {
		chain = currencyDispenser;
	}

}
