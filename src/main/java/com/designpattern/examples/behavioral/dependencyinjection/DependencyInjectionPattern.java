package com.designpattern.examples.behavioral.dependencyinjection;

public class DependencyInjectionPattern {

	public static void main(String[] args) {
		String message = "Design pattern example";
		String emailId = "monika.yadav@gmail.com";
		String phoneNumber = "9667336224";

		IMessageServiceInjector serviceInjector = new SMSMessageServiceInjector();
		IMessageProcesor messageProcesor = serviceInjector.getMessageProcessor();
		messageProcesor.processMessages(message, phoneNumber);

		serviceInjector = new EmailMessageServiceInjector();
		messageProcesor = serviceInjector.getMessageProcessor();
		messageProcesor.processMessages(message, emailId);

	}

}
