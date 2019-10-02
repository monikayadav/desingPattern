package com.designpattern.examples.creational.singleton;

public class SingletonClass {

	private static SingletonClass singletonClass;
	private String message;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if(singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
