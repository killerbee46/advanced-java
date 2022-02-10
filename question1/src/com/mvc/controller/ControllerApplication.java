package com.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.mvc.model.ModelApplication;
import com.mvc.view.ViewApplication;

public class ControllerApplication {
	private ViewApplication view;
	private ModelApplication model;
public ControllerApplication(ViewApplication view, ModelApplication model) {
	
	this.view = view;
	this.model = model;

}

public void ApplicationControl(){
	JButton button  = view.getButton();
	
	button.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {
			model.incrementCount();
			int count  = model.getCount();
			JTextField txtCount = view.getTxtCount();
			txtCount.setText("count");
			
		}
	});
}
public static void main(String[] args) {
	
}
}
