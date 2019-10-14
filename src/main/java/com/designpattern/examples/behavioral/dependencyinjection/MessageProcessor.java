package com.designpattern.examples.behavioral.dependencyinjection;

public class MessageProcessor implements IMessageProcesor {

	IMessageService messageService = null;

	public MessageProcessor(IMessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public void processMessages(String msg, String rec) {
		messageService.sendMessage(msg, rec);
	}

}
