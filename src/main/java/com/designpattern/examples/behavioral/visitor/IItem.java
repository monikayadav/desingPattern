package com.designpattern.examples.behavioral.visitor;

public interface IItem {

	int accept(IItemVisitor itemVisitor);
}
