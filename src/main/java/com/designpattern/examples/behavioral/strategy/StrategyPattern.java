package com.designpattern.examples.behavioral.strategy;

import java.util.Date;

/**
 * Strategy pattern is also known as Policy Pattern. We define multiple
 * algorithms and let client application pass the algorithm to be used as a
 * parameter.
 * 
 * One of the best example of strategy pattern is Collections.sort() method that
 * takes Comparator parameter. Based on the different implementations of
 * Comparator interfaces, the Objects are getting sorted in different ways.
 * 
 * @author Monika
 *
 */

public class StrategyPattern {

	public static void main(String[] args) {
		Item item1 = new Item("item-1", 1, "type-1", new Date());
		Item item2 = new Item("item-2", 2, "type-2", new Date());
		Item item3 = new Item("item-3", 3, "type-3", new Date());
		Item item4 = new Item("item-4", 4, "type-4", new Date());
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		shoppingCart.addItem(item3);
		shoppingCart.addItem(item4);

		shoppingCart.calculateAndPay(new CardPaymentStrategy("12345678910", new Date(), 123, "monika"));
		shoppingCart.calculateAndPay(new PaypalPaymentStrategy("monika71990@gmai.com"));

	}
}
