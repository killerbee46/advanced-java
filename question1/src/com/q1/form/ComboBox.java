package com.q1.form;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBox extends JFrame {
	public ComboBox(){
		setTitle("Combo Box");
		setBounds(10,10,300,300);
		setLayout(null);
		
		String dhyaney[] = {"white","seto","end"};
		final JComboBox combo = new JComboBox(dhyaney);
		combo.setBounds(10,10,150,30);
		add(combo);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(10,50,150,40);
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String value = combo.getSelectedItem().toString();
				System.out.println(value);
				
			}
		});
		
		
		add(btnSubmit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new ComboBox();
	}
}
