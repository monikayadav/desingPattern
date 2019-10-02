package com.designpattern.examples.behavioral.observer;

/**
 * The Observer pattern is used to monitor the state of a certain object, often
 * in a group or one-to-many relationship. In such cases, most of the time, the
 * changed state of a single object can affect the state of the rest, so there
 * must be a system to note the change and alert the other objects.
 * 
 * @author Monika.Yadav
 *
 */

public class ObsereverPattern {

	public static void main(String[] args) {
		Observable observable = new Observable();

		Observer observer1 = new Observer("Observer-1");
		Observer observer2 = new Observer("Observer-2");
		Observer observer3 = new Observer("Observer-3");

		observer1.setObservable(observable);
		observer2.setObservable(observable);
		observer3.setObservable(observable);

		observable.register(observer1);
		observable.register(observer2);
		observable.register(observer3);

		observer1.update();
		observable.notifyObservers("observable has changed");
	}

}
