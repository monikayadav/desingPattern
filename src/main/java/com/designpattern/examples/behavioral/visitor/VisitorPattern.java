package com.designpattern.examples.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Visitor pattern is used when we have to perform an operation on a group of
 * similar kind of Objects. With the help of visitor pattern, we can move the
 * operational logic from the objects to another class.
 * 
 * @author Monika
 *
 */

public class VisitorPattern {
	public static void main(String[] args) {
		Fruit fruit1 = new Fruit(5);
		Fruit fruit2 = new Fruit(15);
		Fruit fruit3 = new Fruit(25);

		Book book1 = new Book(10);
		Book book2 = new Book(100);
		Book book3 = new Book(200);
		List<IItem> itemList = new ArrayList<IItem>();
		itemList.addAll(Arrays.asList(fruit1, fruit2, fruit3, book1, book2, book3));
		int sum = 0;
		IItemVisitor itemVisitor = new ItemVisitor();
		for (IItem item : itemList) {
			sum += item.accept(itemVisitor);
		}
		System.out.print(sum);
	}

}
