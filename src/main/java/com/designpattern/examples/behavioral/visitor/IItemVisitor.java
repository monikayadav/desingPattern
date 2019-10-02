package com.designpattern.examples.behavioral.visitor;

public interface IItemVisitor {

	int visit(Fruit fruit);
	int visit(Book book);
}
