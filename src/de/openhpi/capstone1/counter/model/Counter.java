package de.openhpi.capstone1.counter.model;
import java.util.ArrayList;
import java.util.List;

import de.openhpi.capstone1.counter.view.Observer;

public class Counter implements Subject {

	private int count = 0;

	private List<Observer> observers = new ArrayList<Observer>();

	public void updateCount() {
		this.count++;
		notifyAllObservers();
	}

	@Override
	public void attach(Observer observer){
		observers.add(observer);		
	}
	
	@Override
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update(count);
		}
	}
}
