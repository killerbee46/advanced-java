package com.adjava.LayoutManagement;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SpringLayoutDemo extends JFrame {
	public SpringLayoutDemo() {
		setTitle("spring layout demo");
		setBounds(0,0,500,500);
		
		Container container = getContentPane();
		SpringLayout sLayout = new SpringLayout();
		container.setLayout(sLayout);
		
		JLabel lblName = new JLabel("Username: ");
		lblName.setPreferredSize(new Dimension(100,30));
		
		sLayout.putConstraint(SpringLayout.WEST,lblName,10,SpringLayout.WEST,container);
		sLayout.putConstraint(SpringLayout.NORTH,lblName,10,SpringLayout.NORTH,container);
		
		JTextField txtName = new JTextField();
		txtName.setPreferredSize(new Dimension(200,30));
		
		sLayout.putConstraint(SpringLayout.WEST,txtName,10,SpringLayout.EAST,lblName);
		sLayout.putConstraint(SpringLayout.NORTH,txtName,10,SpringLayout.NORTH,container);
		
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setPreferredSize(new Dimension(100,30));
		
		sLayout.putConstraint(SpringLayout.WEST,lblPassword,10,SpringLayout.WEST,container);
		sLayout.putConstraint(SpringLayout.NORTH,lblPassword,10,SpringLayout.SOUTH,lblName);
		
		JTextField txtPassword = new JTextField();
		txtPassword.setPreferredSize(new Dimension(200,30));
		
		sLayout.putConstraint(SpringLayout.WEST,txtPassword,10,SpringLayout.EAST,lblPassword);
		sLayout.putConstraint(SpringLayout.NORTH,txtPassword,10,SpringLayout.SOUTH,txtName);
		
		container.add(lblName);
		container.add(txtName);
		container.add(txtPassword);
		container.add(lblPassword);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SpringLayoutDemo();
	}
}
