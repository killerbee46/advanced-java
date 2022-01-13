package com.java.eventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonHandling extends JFrame{
	
	static int count = 0;
	public ButtonHandling(){
		
		setTitle("Button Handling");
		setBounds(0,0,200,200);
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
		new ButtonHandling();
	}
}
