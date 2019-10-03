package com.designpattern.examples.behavioral.chainofresponsibility;

public class Dollar50Dispenser implements ICurrencyDispenser {

	ICurrencyDispenser chain;

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 50) {
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
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
