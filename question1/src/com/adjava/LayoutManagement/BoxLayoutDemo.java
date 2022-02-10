package com.adjava.LayoutManagement;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame{
	public BoxLayoutDemo() {
		setTitle("Box");
		setBounds(0,0,500,500);
		
		Container container = getContentPane();
		BoxLayout bLayout = new BoxLayout(container, BoxLayout.X_AXIS);
		container.setLayout(bLayout);
		
		Container container2 = getContentPane();
		BoxLayout b2Layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container2.setLayout(b2Layout);
		
		for(int i = 0; i<10 ;i++){
			JButton btn = new JButton("Button"+i);
			container.add(btn);
//			container2.add(btn);
		}
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] args) {
		new BoxLayoutDemo();
	}
}
