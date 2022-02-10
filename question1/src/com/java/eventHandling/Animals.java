package com.java.eventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Animals extends JFrame{
	static int count = 0;
	public Animals(){
		setTitle("Animals");
		setBounds(0,0,500,500);
		setLayout(null);
		
		JButton button = new JButton("Click Me");
		button.setBounds(10,5,100,30);	
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				count = count + 1;
				System.out.println("hello Peter"+count);
				
				
				
			}
		});
		
		add(button);
		
		setVisible(true);
	}
	public static void main(String[] args){
		new Animals();
	}
}
