package de.openhpi.capstone1.counter.model;

import de.openhpi.capstone1.counter.view.Observer;

public interface Subject {
	public void attach(Observer observer);
	void notifyAllObservers();
}
