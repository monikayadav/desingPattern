package com.designpattern.examples.behavioral.visitor;

public class Fruit implements IItem {
	private int price;

	public Fruit(int price) {
		this.price = price;
	}
	@Override
	public int accept(IItemVisitor itemVisitor) {
		return itemVisitor.visit(this);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
