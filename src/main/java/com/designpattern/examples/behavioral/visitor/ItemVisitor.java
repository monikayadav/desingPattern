package com.designpattern.examples.behavioral.visitor;

public class ItemVisitor implements IItemVisitor {

	@Override
	public int visit(Fruit fruit) {
		int price = fruit.getPrice();
		if (price < 10) {
			price += 5;
			fruit.setPrice(price);
		}
		return price;
	}

	@Override
	public int visit(Book book) {
		int price = book.getPrice();
		if (price < 100) {
			price += 5;
			book.setPrice(price);
		}
		return price;
	}

}
