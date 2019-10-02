package com.designpattern.examples.behavioral.observer;

public class Observer implements IObserver {
	IObservable observable;
	String observerName;

	public Observer(String observerName) {
		this.observerName = observerName;
	}

	@Override
	public void setObservable(IObservable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		String msg = (String) observable.getUpdate(this);
		if (msg == null) {
			System.out.println(observerName + ":: No new message");
		} else
			System.out.println(observerName + ":: Consuming message::" + msg);
	}

}
