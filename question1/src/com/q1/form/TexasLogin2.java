package com.q1.form;
import javax.swing.*;

public class TexasLogin2 extends JFrame{
	public TexasLogin2(){
		
		setTitle("Texas Login 2");
		setBounds(0,0,300,200);
		setLayout(null);
		
		ImageIcon user = new  ImageIcon("C:\\Users\\Dell\\Desktop\\Ad_JAVA_class\\question1\\src\\com\\q1\\form\\user.png");
		ImageIcon key = new ImageIcon("C:\\Users\\Dell\\Desktop\\Ad_JAVA_class\\question1\\src\\com\\q1\\form\\key.png");

		JLabel name = new JLabel(user);
		name.setBounds(10,10,100,30);
		add(name);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(100,10,150,30);
		add(nameField);
		
		JLabel password = new JLabel(key);
		password.setBounds(10,40,100,30);
		add(password);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(100,40,150,30);
		add(passwordField);
		
		JButton submit = new JButton("L0GIN");
		submit.setBounds(100,100,100,30);
		add(submit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		TexasLogin2 login2 = new TexasLogin2();
	}
}
