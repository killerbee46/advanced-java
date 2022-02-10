package com.adjava.LayoutManagement;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutDemo extends JFrame{
	public FlowLayoutDemo(){
		setTitle("Flow Layout Demo");
		setBounds(0,0,300,300);
		setLayout(new FlowLayout());
		
		JLabel lblName = new JLabel("Username: ");
		JTextField txtUserName = new JTextField();
		
		add(lblName);
		add(txtUserName);
		
		setVisible(true);
	}
	public static void main(String[] args){
		new FlowLayoutDemo();
	}
}
