package com.designpattern.examples.creational.singleton;

/**
 * The Singleton Design Pattern aims to keep a check on initialization of
 * objects of a particular class by ensuring that only one instance of the
 * object exists throughout the Java Virtual Machine.
 * 
 * 
 * A Singleton class also provides one unique global access point to the object
 * so that each subsequent call to the access point returns only that particular
 * object.
 * 
 * @author Monika.Yadav
 *
 */
public class SingletonPattern {

	public static void main(String[] args) {
		SingletonClass singletonClass1 = SingletonClass.getInstance();
		singletonClass1.setMessage("message - 1");
		System.out.println(singletonClass1.getMessage());

		SingletonClass singletonClass2 = SingletonClass.getInstance();
		singletonClass2.setMessage("message - 2");
		System.out.println(singletonClass1.getMessage());
		System.out.println(singletonClass2.getMessage());

		SingletonClass singletonClass3 = SingletonClass.getInstance();
		singletonClass3.setMessage("message - 3");
		System.out.println(singletonClass1.getMessage());
		System.out.println(singletonClass2.getMessage());
		System.out.println(singletonClass3.getMessage());
	}
}
