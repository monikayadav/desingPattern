package com.designpattern.examples.behavioral.dependencyinjection;

public class SMSMessageService implements IMessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("Sending SMS message " + msg + " to " + rec);

	}

}
