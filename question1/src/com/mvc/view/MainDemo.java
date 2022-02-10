package com.mvc.view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MainDemo extends JFrame{
	
	public MainDemo() {
		setTitle("mvc design");
		setBounds(0,0,500,500);
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,10,10);
		Container container = getContentPane();
		container.setLayout(flowLayout);
		
		
	}
	
	public static void main(String[] args) {
		new MainDemo();
	}
}
