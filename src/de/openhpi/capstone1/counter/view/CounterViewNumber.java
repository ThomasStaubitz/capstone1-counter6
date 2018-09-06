package de.openhpi.capstone1.counter.view;

import java.awt.Panel;
import java.awt.TextField;

import de.openhpi.capstone1.counter.model.Subject;

public class CounterViewNumber extends Observer {

	Panel p = new Panel(); 
	TextField tf = new TextField();
	
	public CounterViewNumber(Subject counter) {
		super(counter);
		init();
	}

	public void init(){
		update("0");
		p.add(tf);
	}

	public void update(Object value) {
//		System.out.println("number view update: " + value);
		tf.setText(value + "");
	}
	
	public Panel getPanel() {
		return this.p;
	}

}