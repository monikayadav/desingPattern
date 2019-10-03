package com.designpattern.examples.behavioral.iterator;

public class Account {
	private String name;
	private AccountTypeEnum accountType;

	public Account(String name, AccountTypeEnum accountType) {
		this.accountType = accountType;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountTypeEnum getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}

}
