package com.adjava.LayoutManagement;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GroupLayoutDemo extends JFrame{
	public GroupLayoutDemo(){
		setTitle("group layout demo");
		setBounds(0,0,500,500);
		
		Container container = getContentPane();
		GroupLayout gLayout = new GroupLayout(container);
		container.setLayout(gLayout);
		
		JLabel lblName = new JLabel("Username: ");
		lblName.setPreferredSize(new Dimension(100,30));
		
		JTextField txtName = new JTextField();
		txtName.setPreferredSize(new Dimension(200,30));
		
		GroupLayout.SequentialGroup hGroup = gLayout.createSequentialGroup();
		
		hGroup.addGroup(gLayout.createParallelGroup().addComponent(lblName).addComponent(lblName));
		gLayout.setHorizontalGroup(hGroup);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new GroupLayoutDemo();
	}
}
