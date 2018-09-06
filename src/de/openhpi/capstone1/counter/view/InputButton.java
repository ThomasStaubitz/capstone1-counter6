package de.openhpi.capstone1.counter.view;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.openhpi.capstone1.counter.controller.CounterController;

public class InputButton extends Button implements ActionListener {
	
	CounterController controller;

	public InputButton(CounterController controller, String label) {
		super(label);
		this.controller = controller;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.handleEvent();
	}
}
