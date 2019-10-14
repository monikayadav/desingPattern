package com.designpattern.examples.behavioral.dependencyinjection;

public class EmailMessageService implements IMessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("Sending Email message " + msg + " to " + rec);

	}

}
