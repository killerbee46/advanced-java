package com.q1.form;
import javax.swing.*;

public class TextArea extends JFrame{
	public TextArea(){
		setTitle("Text Area");
		setBounds(10,10,900,900);
		setLayout(null);
		
		JLabel address = new JLabel("Address: ");
		address.setBounds(15, 15, 100, 30);
		add(address);
		
		JTextArea address_field = new JTextArea(50,10);
		address_field.setLineWrap(true);
		address_field.setBounds(15, 50, 150, 50);
		add(address_field);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		TextArea abc = new TextArea();
	}
}
