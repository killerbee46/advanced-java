package com.q1.form;
import javax.swing.*;

public class ComboBox extends JFrame {
	public ComboBox(){
		setTitle("Combo Box");
		setBounds(10,10,300,300);
		setLayout(null);
		
		String dhyaney[] = {"white","seto","end"};
		JComboBox combo = new JComboBox(dhyaney);
		combo.setBounds(10,10,150,30);
		add(combo);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new ComboBox();
	}
}