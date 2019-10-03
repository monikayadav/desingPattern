package com.designpattern.examples.behavioral.chainofresponsibility;

public class Dollar20Dispenser implements ICurrencyDispenser {

	ICurrencyDispenser chain;

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 20) {
			int num = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");
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
