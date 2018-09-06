package de.openhpi.capstone1.counter.view;

import java.awt.Color;
import java.awt.Panel;

import de.openhpi.capstone1.counter.model.Subject;

public class CounterViewColor extends Observer {

	Panel p = new Panel(); 
	Color[] colors = new Color[4];
	
	public CounterViewColor(Subject counter) {
		super(counter);
		init();
	}

	public void init(){
		colors[0] = Color.black;
		colors[1] = Color.blue;
		colors[2] = Color.orange;
		colors[3] = Color.red;
		
		update(colors[0]);
	}

	public void update(Object value) {
		try {
			int index = ((int) value) % 4;
//			System.out.println("color update: " + index);
			p.setBackground(colors[index]);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Panel getPanel() {
		return this.p;
	}
}