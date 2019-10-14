package com.designpattern.examples.behavioral.dependencyinjection;

public class SMSMessageServiceInjector implements IMessageServiceInjector {

	@Override
	public MessageProcessor getMessageProcessor() {
		return new MessageProcessor(new SMSMessageService());
	}

}
