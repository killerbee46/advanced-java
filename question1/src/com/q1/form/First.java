package com.q1.form;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class First extends JFrame {

	public First() throws HeadlessException {
//		JFrame Attributes
		setTitle("User Registration Form");
		setBounds(10,10,300,300);
		setLayout(null);
		
		JLabel firstName=new JLabel("First Name: ");
		firstName.setBounds(15,15,100,30);
		add(firstName);
		
		JTextField firstNameField=new JTextField();
		firstNameField.setBounds(90,15,150,30);
		add(firstNameField);
		
		JLabel middleName=new JLabel("Middle Name: ");
		middleName.setBounds(15,50,100,30);
		add(middleName);
		
		JTextField middleNameField=new JTextField();
		middleNameField.setBounds(90,50,150,30);
		add(middleNameField);
		
		JLabel lastName=new JLabel("Last Name: ");
		lastName.setBounds(15,85,100,30);
		add(lastName);
		
		JTextField lastNameField=new JTextField();
		lastNameField.setBounds(90,85,150,30);
		add(lastNameField);
		
		JLabel address=new JLabel("Address: ");
		address.setBounds(15,120,100,30);
		add(address);
		
		JTextField addressField=new JTextField();
		addressField.setBounds(90,120,150,30);
		add(addressField);
		
		JButton submit=new JButton("Submit");
		submit.setBounds(80, 155, 100, 30);
		add(submit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		First assignment1=new First();
	}
	

}