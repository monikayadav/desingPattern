package com.designpattern.examples.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class AccountCollectionImpl implements IAccountCollection {

	private List<Account> accountList = new ArrayList<Account>();

	@Override
	public void addAccount(Account account) {
		if (!accountList.contains(account)) {
			accountList.add(account);
		}
	}

	@Override
	public void removeAccount(Account account) {
		if (accountList.contains(account)) {
			accountList.remove(account);
		}
	}

	@Override
	public IAccountIterator iterator(AccountTypeEnum accountType) {
		return new AccountIteratorImpl(accountType, this.accountList);
	}

	private class AccountIteratorImpl implements IAccountIterator {
		private AccountTypeEnum accountType;
		private List<Account> accountList;
		private int position;

		public AccountIteratorImpl(AccountTypeEnum accountType, List<Account> accountList) {
			this.accountList = accountList;
			this.accountType = accountType;
		}

		@Override
		public boolean hasNext() {
			while (position < accountList.size()) {
				Account account = accountList.get(position);
				if (account.getAccountType().equals(accountType)
						|| accountType.equals(AccountTypeEnum.ALL)) {
					return true;
				}
				position++;
			}
			return false;
		}

		@Override
		public Account next() {
			Account account = accountList.get(position);
			position++;
			return account;
		}

	}

}
