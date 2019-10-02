package com.designpattern.examples.behavioral.strategy;

public class PaypalPaymentStrategy implements IPaymentStrategy {
	private String emailId;

	public PaypalPaymentStrategy(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public void pay(Item item) {
		System.out.println(
				"Making payment to the PayPal account with email id - " + this.emailId + " for item " + item.getName());
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
