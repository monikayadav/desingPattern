package com.designpattern.examples.behavioral.iterator;

public class IteratorPattern {

	public static void main(String[] args) {
		Account account1 = new Account("ACCOUNT1", AccountTypeEnum.OMNIBUS);
		Account account2 = new Account("ACCOUNT2", AccountTypeEnum.SEGREGATE);
		Account account3 = new Account("ACCOUNT3", AccountTypeEnum.OMNIBUS);
		Account account4 = new Account("ACCOUNT4", AccountTypeEnum.SEGREGATE);
		Account account5 = new Account("ACCOUNT5", AccountTypeEnum.OMNIBUS);
		Account account6 = new Account("ACCOUNT6", AccountTypeEnum.SEGREGATE);
		Account account7 = new Account("ACCOUNT7", AccountTypeEnum.OMNIBUS);
		Account account8 = new Account("ACCOUNT8", AccountTypeEnum.SEGREGATE);

		AccountCollectionImpl accountCollectionImpl = new AccountCollectionImpl();
		accountCollectionImpl.addAccount(account1);
		accountCollectionImpl.addAccount(account2);
		accountCollectionImpl.addAccount(account3);
		accountCollectionImpl.addAccount(account4);
		accountCollectionImpl.addAccount(account5);
		accountCollectionImpl.addAccount(account6);
		accountCollectionImpl.addAccount(account7);
		accountCollectionImpl.addAccount(account8);

		IAccountIterator iterator1 = accountCollectionImpl.iterator(AccountTypeEnum.ALL);
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next().getName());
		}
		System.out.println("*******************************************");

		IAccountIterator iterator2 = accountCollectionImpl.iterator(AccountTypeEnum.OMNIBUS);
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next().getName());
		}
	}

}
