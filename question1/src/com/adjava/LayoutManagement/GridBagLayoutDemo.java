package com.adjava.LayoutManagement;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridBagLayoutDemo extends JFrame{
	public GridBagLayoutDemo(){
		setTitle("grid bag layout demo");
		setBounds(0,0,500,500);
		
		Container container = getContentPane();
		GridBagLayout gBLayout = new GridBagLayout();
		container.setLayout(gBLayout);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		JLabel lblUserName = new JLabel("UserName:");
		lblUserName.setPreferredSize(new Dimension(100,30));
		gbc.gridx = 0;
		gbc.gridy = 0;
		container.add(lblUserName,gbc);
		
		JTextField txtUserName = new JTextField();
		txtUserName.setPreferredSize(new Dimension(200,30));
		gbc.gridx = 1;
		gbc.gridy = 0;
		container.add(txtUserName,gbc);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setPreferredSize(new Dimension(100,30));
		gbc.gridx = 0;
		gbc.gridy = 1;
		container.add(lblPassword,gbc);
		
		JTextField txtPassword = new JTextField();
		txtPassword.setPreferredSize(new Dimension(200,30));
		gbc.gridx = 1;
		gbc.gridy = 1;
		container.add(txtPassword,gbc);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GridBagLayoutDemo();  
	}
}
