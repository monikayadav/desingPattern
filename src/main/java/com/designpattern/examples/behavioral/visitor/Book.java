package com.designpattern.examples.behavioral.visitor;

public class Book implements IItem {
	private int price;
	
	public Book(int price) {
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
