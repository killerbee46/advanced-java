package com.q1.form;
import javax.swing.*;

public class Radio extends JFrame{
	public Radio(){
		
		setTitle("Radio Button");
		setBounds(0,0,300,300);
		setLayout(null);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(5,5,90,30);
		add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(100,5,100,30);
		add(female);
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		Radio gender = new Radio();
	}
}
