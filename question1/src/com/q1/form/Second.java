package com.q1.form;

import java.awt.HeadlessException;

import javax.swing.*;

public class Second extends JFrame{
	public Second() throws HeadlessException{
		setTitle("Password");
		setBounds(10,10,700,700);
		setLayout(null);
		
		JLabel name = new JLabel("Name: ");
		name.setBounds(10,15,50,20);
		add(name);
		
		JTextField nameField=new JTextField();
		nameField.setBounds(50,15,150,30);
		add(nameField);
		
		JLabel password = new JLabel("Password: ");
		password.setBounds(10,40,90,30);
		add(password);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(75,50,150,30);
		add(passwordField);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		Second App = new Second();
	}
}
