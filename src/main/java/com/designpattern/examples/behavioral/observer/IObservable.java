package com.designpattern.examples.behavioral.observer;

public interface IObservable {
	void register(IObserver observer);

	void unregister(IObserver observer);

	String getUpdate(IObserver observer);

	void notifyObservers(String message);

}
