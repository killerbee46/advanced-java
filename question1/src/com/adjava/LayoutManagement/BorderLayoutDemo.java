package com.adjava.LayoutManagement;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo extends JFrame {

	public BorderLayoutDemo(){
		setTitle("Border Layout Demo");
		setBounds(0,0,900,900);
		setLayout(new BorderLayout());
		
		JPanel panel_west = new JPanel();
		panel_west.setBackground(Color.black);
		
		JPanel panel_north = new JPanel();
		panel_north.setBackground(Color.yellow);
		
		JPanel panel_south = new JPanel();
		panel_south.setBackground(Color.blue);
		
		JPanel panel_east = new JPanel();
		panel_east.setBackground(Color.red);
		panel_east.setPreferredSize(new Dimension(100,200));
		
		add(panel_east,java.awt.BorderLayout.EAST);
		add(panel_west,java.awt.BorderLayout.WEST);
		add(panel_south,java.awt.BorderLayout.NORTH);
		add(panel_north,java.awt.BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setLayout(BorderLayout borderLayout) {
		// TODO Auto-generated method stub
		
	}
	private void setLayout(BorderLayout borderLayout) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		new BorderLayoutDemo();
	}
}
