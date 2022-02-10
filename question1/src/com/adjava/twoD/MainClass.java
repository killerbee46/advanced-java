package com.adjava.twoD;

import java.awt.Color;

import javax.swing.*;

public class MainClass extends JFrame {
	public MainClass(){
		setTitle("2D demo");
		setBounds(0,0,700,700);
		setLayout(null);
		
		DrawComponents jpanel = new DrawComponents();
		jpanel.setBounds(0,0,600,600);
		jpanel.setBackground(Color.black);
		add(jpanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new MainClass();
	}
}
