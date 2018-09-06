package de.openhpi.capstone1.counter.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import de.openhpi.capstone1.counter.controller.CounterController;
import de.openhpi.capstone1.counter.model.Subject;

public class Layout extends Panel {
	
	CounterController controller;
	Subject counter;
	
	public Layout (CounterController controller, Subject counter) {
		this.controller = controller;
		this.counter = counter;
	}

	public Dimension preferredSize() {
		return new Dimension(200, 100);
	}

	public void init() {
		setLayout(new BorderLayout());
		Panel p;
		p = new Panel();
		p.setLayout(new GridLayout(0, 2));
		p.add(new Label("Button"));
		p.add(new InputButton(controller, "Press Me"));
		p.add(new Label("Counter"));
		CounterViewNumber counterViewNumber = new CounterViewNumber(counter);
		p.add(counterViewNumber.getPanel());    
		CounterViewColor counterViewColor = new CounterViewColor(counter);
		p.add(counterViewColor.getPanel());
		add(p);
	}
}
