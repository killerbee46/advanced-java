package com.q1.form;
import javax.swing.*;

public class TexasLogin1 extends JFrame{
	public TexasLogin1(){
		
		setTitle("Texas Login");
		setBounds(0,0,300,200);
		setLayout(null);
		
		JLabel name = new JLabel("Name: ");
		name.setBounds(10,10,100,30);
		add(name);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(100,10,150,30);
		add(nameField);
		
		JLabel password = new JLabel("Password: ");
		password.setBounds(10, 50, 100, 30);
		add(password);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(100,50,150,30);
		add(passwordField);
		
		JButton submit = new JButton("LogIn");
		submit.setBounds(100,90,100,30);
		add(submit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		TexasLogin1 login1 = new TexasLogin1();
	}

}
