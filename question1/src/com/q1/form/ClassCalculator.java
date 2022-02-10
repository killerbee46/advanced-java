package com.q1.form;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClassCalculator extends JFrame {
	JLabel lblNum1, lblNum2, lblResult;
	JTextField txtNum1, txtNum2, txtResult;
	JButton btnAdd, btnSub, btnDiv, btnMul;
	
	public ClassCalculator(){
		setTitle("Class Calculator");
		setBounds(0,0,900,900);
		setLayout(null);
		
		lblNum1 = new JLabel("Num 1:");
		lblNum1.setBounds(5,5,100,30);
		add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(5,50,100,30);
		add(txtNum1);
		
		lblNum2 = new JLabel("Num 2:");
		lblNum2.setBounds(120,5,100,30);
		add(lblNum2);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(5,50,100,30);
		add(txtNum2);

		lblResult = new JLabel("Result");
		lblResult.setBounds(5,120,100,30);
		add(lblResult);

		txtResult = new JTextField();
		setBounds(5,50,100,30);
		add(txtResult);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new ClassCalculator();
	}
}
