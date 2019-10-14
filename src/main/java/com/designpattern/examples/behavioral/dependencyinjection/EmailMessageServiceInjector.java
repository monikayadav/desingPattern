package com.designpattern.examples.behavioral.dependencyinjection;

public class EmailMessageServiceInjector implements IMessageServiceInjector {

	@Override
	public MessageProcessor getMessageProcessor() {
		return new MessageProcessor(new EmailMessageService());
	}

}
