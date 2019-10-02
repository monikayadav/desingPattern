package com.designpattern.examples.behavioral.observer;

public interface IObserver {

	void update();

	void setObservable(IObservable observable);

}
