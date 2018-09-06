package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Subject;

public abstract class Observer {
	
	public Observer(Subject subject) {
		subject.attach(this);
	}
	
	public abstract void update(Object value);
}


