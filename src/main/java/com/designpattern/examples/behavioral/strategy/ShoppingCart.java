package com.designpattern.examples.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> itemList = new ArrayList<Item>();

	void addItem(Item item) {
		itemList.add(item);
	}

	void removeItem(Item item) {
		itemList.remove(item);
	}
	
	int calculateAndPay(IPaymentStrategy paymentStrategy) {
		int sum = 0;
		for(Item item : itemList) {
			sum += item.getPrice();
			paymentStrategy.pay(item);
		}
		return sum;
		
	}
}
