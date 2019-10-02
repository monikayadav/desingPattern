package com.designpattern.examples.behavioral.strategy;

import java.util.Date;

public class CardPaymentStrategy implements IPaymentStrategy {
	private String cardNumber;
	private Date expiryDate;
	private int cvv;
	private String nameOnCard;

	public CardPaymentStrategy(String cardNumber, Date expiryDate, int cvv, String nameOnCard) {
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.nameOnCard = nameOnCard;
	}

	@Override
	public String toString() {
		return "cardNumber - " + cardNumber + " expiryDate -" + this.expiryDate + " cvv " + this.cvv + " nameOnCard "
				+ this.nameOnCard;

	}

	@Override
	public void pay(Item item) {
		System.out.println("Making payment through card " + this.toString() + " for item " + item.getName());
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

}
