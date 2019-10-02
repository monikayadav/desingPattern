package com.designpattern.examples.behavioral.strategy;

import java.util.Date;

public class Item {
	private String name;
	private int price;
	private String itemType;
	private Date dateOfPurchase;

	public Item(String name, int price, String itemType, Date dateOfPurchase) {
		this.name = name;
		this.price = price;
		this.itemType = itemType;
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

}
