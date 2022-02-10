package com.q1.form;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	public Calculator(){
		setTitle("Calculator");
		setBounds(0,0,500,500);
		setLayout(null);
		
		JLabel num1 = new JLabel("Num 1");
		num1.setBounds(10,10,100,30);
		
		JLabel num2 = new JLabel("Num 2");
		num2.setBounds(150,10,100,30);
		
		add(num1);
		add(num2);
		
		final JTextField txtNum1 = new JTextField();
		txtNum1.setBounds(10, 40,100,30);
		
		JTextField num2Field = new JTextField();
		num2Field.setBounds(150, 40,100,30);
		
		add(txtNum1);
		add(num2Field);
		
		JButton add = new JButton("+");
		add.setBounds(10,90,50,30);
		add.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String num1 = txtNum1.getText();
				System.out.println(num1);
				
			}
		});
		
		JButton substract = new JButton("-");
		substract.setBounds(70,90,50,30);
		
		JButton multiply = new JButton("*");
		multiply.setBounds(135,90,50,30);
		
		JButton divide = new JButton("/");
		divide.setBounds(200,90,50,30);
		
		add(add);
		add(substract);
		add(multiply);
		add(divide);
		
		JLabel result = new JLabel("Result");
		result.setBounds(10,130,150,30);
		
		add(result);
		
		JTextField resultField = new JTextField();
		resultField.setBounds(10,170,150,30);
		
		add(resultField);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new Calculator();
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
