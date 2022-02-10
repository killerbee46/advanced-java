package com.mvc.view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ViewApplication extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	Container container;
	JTextField txtCount;
	JButton button;
	public ViewApplication() {
		setBounds(0,0,400,400);
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT,10,10);
		Container container=getContentPane();
		container.setLayout(flowLayout);
		
		JTextField field=new JTextField("0"); 
		field.setPreferredSize(new Dimension(360,100));
		JButton button=new JButton("Click Me");
		button.setPreferredSize(new Dimension(360,50));
		container.add(field);
		container.add(button); 
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public JTextField getTxtCount(){
		return txtCount;
	}
	
	public JButton getButton(){
		return button;
	}
	
	public static void main(String[] args) {
		new ViewApplication();
	}
}
