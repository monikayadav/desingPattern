package com.designpattern.examples.behavioral.iterator;

public interface IAccountCollection {

	void addAccount(Account account);

	void removeAccount(Account account);

	IAccountIterator iterator(AccountTypeEnum accountType);
}
