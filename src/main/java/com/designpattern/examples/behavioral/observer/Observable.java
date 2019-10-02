package com.designpattern.examples.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable {
	private List<IObserver> observerList;
	private String message;
	private final Object MUTEX = new Object();

	public Observable() {
		observerList = new ArrayList<>();
	}

	@Override
	public void register(IObserver observer) {
		synchronized (MUTEX) {
			if (!observerList.contains(observer)) {
				observerList.add(observer);
			}
		}
	}

	@Override
	public void unregister(IObserver observer) {
		synchronized (MUTEX) {
			if (observerList.contains(observer)) {
				observerList.remove(observer);
			}
		}
	}

	@Override
	public String getUpdate(IObserver observer) {
		return this.message;
	}

	@Override
	public void notifyObservers(String message) {
		synchronized (MUTEX) {
			for (IObserver observer : observerList) {
				this.message = message;
				observer.update();
			}
		}
	}

}
